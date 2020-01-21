package com.crossrainbow.pm.web.controller;

import com.crossrainbow.pm.common.result.CommonResult;
import com.crossrainbow.pm.common.util.WebMapUtil;
import com.crossrainbow.pm.server.service.entity.Role;
import com.crossrainbow.pm.server.service.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 15:12 2019/12/23
 */
@Slf4j
@RestController
@RequestMapping
public class LoginController extends CommonController{


    @PostMapping(value = "/login")
    @ResponseBody
    public Map<String, Object> login(String username, String password) {
        Map<String, Object> responseMap = WebMapUtil.newMap();
        // 想要得到 SecurityUtils.getSubject() 的对象．．访问地址必须跟 shiro 的拦截地址内．不然后会报空指针
        Subject sub = SecurityUtils.getSubject();
        // 用户输入的账号和密码,,存到UsernamePasswordToken对象中..然后由shiro内部认证对比,
        // 认证执行者交由 com.battcn.config.AuthRealm 中 doGetAuthenticationInfo 处理
        // 当以上认证成功后会向下执行,认证失败会抛出异常
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            sub.login(token);
        } catch (UnknownAccountException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,用户不存在", username);
            token.clear();
            WebMapUtil.changeMap(responseMap, "-1", "UnknownAccountException");
        } catch (LockedAccountException lae) {
            log.error("对用户[{}]进行登录验证,验证未通过,账户已锁定", username);
            token.clear();
            WebMapUtil.changeMap(responseMap, "-1", "LockedAccountException");
        } catch (ExcessiveAttemptsException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,错误次数过多", username);
            token.clear();
            WebMapUtil.changeMap(responseMap, "-1", "ExcessiveAttemptsException");
        } catch (AuthenticationException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,堆栈轨迹如下", username, e);
            token.clear();
            WebMapUtil.changeMap(responseMap, "-1", "AuthenticationException");
        }
        User user = this.getUserInfo();
        List<Role> roleList = user.getRoleList();
        responseMap.put("roleList", roleList);
        responseMap.put("roleListSize", roleList.size());
        return responseMap;
    }


}
