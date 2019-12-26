package com.crossrainbow.pm.web.shiro;


import com.crossrainbow.pm.server.domain.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 14:34 2019/12/23
 */
@Slf4j
@Configuration
public class AuthRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Session session = SecurityUtils.getSubject().getSession();
        User user = (User) session.getAttribute("user_session");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        Set<String> roles = new HashSet<>();
        roles.add(user.getRoleName());
        simpleAuthorizationInfo.setRoles(roles);
        final Map<String, Collection<String>> permissionsCache = DBCache.PERMISSIONS_CACHE;
        Collection<String> permissions = permissionsCache.get(user.getRoleName());
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("[AuthRealm.doGetAuthenticationInfo]登录认证开始authenticationToken:{}", authenticationToken);
        String username = (String) authenticationToken.getPrincipal();
        User user = Optional.ofNullable(DBCache.USERS_CACHE.get(username)).orElseThrow(UnknownAccountException::new);
        if(user.isLocked()){
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, user.getPassword(), getName());
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("user_session", user);
        return authenticationInfo;
    }
}
