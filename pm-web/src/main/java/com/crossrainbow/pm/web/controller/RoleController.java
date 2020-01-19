package com.crossrainbow.pm.web.controller;

import com.crossrainbow.pm.common.result.CommonResult;
import com.crossrainbow.pm.server.service.entity.Role;
import com.crossrainbow.pm.server.service.intf.IRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:19 2020/1/19
 */
@RestController("/roles")
public class RoleController {

    @Resource
    private IRoleService roleService;

    @PostMapping(value = "/")
    @RequiresPermissions(value = "role:add")
    public CommonResult addRole(Role role){
        roleService.insert(role);
        return new CommonResult();
    }

}
