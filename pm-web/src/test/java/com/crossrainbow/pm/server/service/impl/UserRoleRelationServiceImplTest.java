package com.crossrainbow.pm.server.service.impl;


import com.crossrainbow.pm.server.service.entity.UserRoleRelation;
import com.crossrainbow.pm.server.service.intf.IUserRoleRelationService;
import com.crossrainbow.pm.web.PmWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:13 2020/1/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PmWebApplication.class)
public class UserRoleRelationServiceImplTest {

    @Resource
    private IUserRoleRelationService userRoleRelationService;

    @Test
    public void testUserRoleRelationInsert(){
        UserRoleRelation userRoleRelation = new UserRoleRelation();
        userRoleRelation.setUrrRoleId(2L);
        userRoleRelation.setUrrUserId(1L);
        userRoleRelationService.insert(userRoleRelation);
    }

    @Test
    public void testUserRoleRelationDelete(){
        userRoleRelationService.deleteById(2L);
    }

}