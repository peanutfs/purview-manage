package com.crossrainbow.pm.server.service.impl;

import com.crossrainbow.pm.server.service.entity.Privilege;
import com.crossrainbow.pm.server.service.intf.IPrivilegeService;
import com.crossrainbow.pm.web.PmWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 15:40 2020/1/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PmWebApplication.class)
public class PrivilegeServiceImplTest {

    @Resource
    private IPrivilegeService iPrivilegeService;

    @Test
    public void testPrivilegeInsert(){
        Privilege privilege = new Privilege();
        privilege.setPrivilegeCode("system:view");
        privilege.setPrivilegeName("用户查看");
        privilege.setResourceId(1L);
        iPrivilegeService.insert(privilege);
    }

    @Test
    public void testPrivilegeUpdate(){
        Privilege privilege = iPrivilegeService.selectById(1L);
        privilege.setPrivilegeName("系统管理查看");
        iPrivilegeService.updateById(privilege);
    }
}
