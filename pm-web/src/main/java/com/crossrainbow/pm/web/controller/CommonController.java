package com.crossrainbow.pm.web.controller;

import com.crossrainbow.pm.server.service.entity.User;
import org.apache.shiro.SecurityUtils;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:34 2020/1/19
 */
public class CommonController {

    protected User getUserInfo(){
        return (User)SecurityUtils.getSubject().getSession().getAttribute("user_session");
    }

}
