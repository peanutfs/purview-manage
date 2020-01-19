package com.crossrainbow.pm.web.shiro;


import com.crossrainbow.pm.common.constants.ShiroErrorMsgConstants;
import com.crossrainbow.pm.common.enums.ResponseErrorEnum;
import com.crossrainbow.pm.common.exception.UserNotRelateRoleException;
import com.crossrainbow.pm.server.service.entity.Privilege;
import com.crossrainbow.pm.server.service.entity.Role;
import com.crossrainbow.pm.server.service.entity.User;
import com.crossrainbow.pm.server.service.intf.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.*;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 14:34 2019/12/23
 */
@Slf4j
@Configuration
public class AuthRealm extends AuthorizingRealm {

    @Resource
    private IUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("[AuthRealm.doGetAuthorizationInfo]用户授权开始principalCollection:{}", principalCollection);
        Session session = SecurityUtils.getSubject().getSession();
        User user = (User) session.getAttribute("user_session");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        List<Role> roles = Optional.ofNullable(user.getRoleList()).orElseThrow(()
                -> new UserNotRelateRoleException(ResponseErrorEnum.USER_NOT_RELATE_ROLE.getCode(), ResponseErrorEnum.USER_NOT_RELATE_ROLE.getMsg()));
        Set<String> roleCodeSet = new HashSet<>();
        List<String> privilegeCodeList = new ArrayList<>();
        for(Role role: roles){
            roleCodeSet.add(role.getRoleCode());
            List<Privilege> privilegeList = role.getPrivilegeList();
            if(CollectionUtils.isNotEmpty(privilegeCodeList)){
                privilegeList.forEach(privilege-> simpleAuthorizationInfo.addStringPermission(privilege.getPrivilegeCode()));
            }
        }
        simpleAuthorizationInfo.setRoles(roleCodeSet);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("[AuthRealm.doGetAuthenticationInfo]登录认证开始authenticationToken:{}", authenticationToken);
        String username = (String) authenticationToken.getPrincipal();
        User user = Optional.ofNullable(userService.selectByUsername(username)).orElseThrow(() -> new UnknownAccountException(ShiroErrorMsgConstants.UNKNOWN_ACCOUNT));
        log.info("[AuthRealm.doGetAuthenticationInfo]用户信息为user:{}", user);
        if(user.isLocked()){
            log.error("[AuthRealm.doGetAuthenticationInfo]账户被锁定user:{}", user);
            throw new LockedAccountException(ShiroErrorMsgConstants.USER_LOCKED);
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                user,
                user.getPassword(),
                ByteSource.Util.bytes(user.getUserSalt()),
                this.getName()
        );
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("user_session", user);
        return simpleAuthenticationInfo;
    }
}
