package com.crossrainbow.pm.web.controller;

import com.crossrainbow.pm.common.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 15:12 2019/12/23
 */
@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {


    @RequestMapping("/home")
    public String toFtl(){
        return "common/home";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public CommonResult login(String username, String password, RedirectAttributes model) {
        CommonResult commonResult = new CommonResult();
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
            commonResult.setCode("-1");
            commonResult.setMsg("UnknownAccountException");
        } catch (LockedAccountException lae) {
            log.error("对用户[{}]进行登录验证,验证未通过,账户已锁定", username);
            token.clear();
            commonResult.setCode("-1");
            commonResult.setMsg("LockedAccountException");
        } catch (ExcessiveAttemptsException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,错误次数过多", username);
            token.clear();
            commonResult.setCode("-1");
            commonResult.setMsg("ExcessiveAttemptsException");
        } catch (AuthenticationException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,堆栈轨迹如下", username, e);
            token.clear();
            commonResult.setCode("-1");
            commonResult.setMsg("AuthenticationException");
        }
        return commonResult;
    }

    @GetMapping(value = "/login")
    public String directLogin(){
        return "login/login";
    }


    @GetMapping(value = "/index")
    public String index(){
        return "common/index";
    }

}
