package com.crossrainbow.pm.server.service.impl;

import com.crossrainbow.pm.server.service.entity.RolePrivilegeRelation;
import com.crossrainbow.pm.server.service.intf.IRolePrivilegeRelationService;
import com.crossrainbow.pm.web.PmWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 17:25 2020/1/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PmWebApplication.class)
public class RolePrivilegeRelationServiceImplTest {

    @Resource
    private IRolePrivilegeRelationService iRolePrivilegeRelationService;

    @Test
    public void testRolePrivilegeRelationTest(){
        RolePrivilegeRelation rolePrivilegeRelation = new RolePrivilegeRelation();
        rolePrivilegeRelation.setRprRoleId(1L);
        rolePrivilegeRelation.setRprPrivilegeId(1L);
        iRolePrivilegeRelationService.insert(rolePrivilegeRelation);
    }
}
