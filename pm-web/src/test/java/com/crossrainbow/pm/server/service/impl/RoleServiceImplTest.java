package com.crossrainbow.pm.server.service.impl;

import com.crossrainbow.pm.server.service.entity.Role;
import com.crossrainbow.pm.server.service.intf.IRoleService;
import com.crossrainbow.pm.web.PmWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 14:19 2020/1/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PmWebApplication.class)
public class RoleServiceImplTest {

    @Resource
    private IRoleService iRoleService;

    @Test
    public void insertRole(){
        Role role = new Role();
        role.setRoleName("管理员");
        role.setRoleCode("Administrator");
        role.setRoleType("ALL");
        iRoleService.insert(role);
    }

    @Test
    public void updateRole(){
        Role role = iRoleService.selectById(2L);
        role.setRoleType("O");
        role.setRoleCode("Operator");
        role.setRoleName("操作员");
        iRoleService.updateById(role);
    }

    @Test
    public void testRoleDelete(){
        iRoleService.deleteById(2L);
    }

}