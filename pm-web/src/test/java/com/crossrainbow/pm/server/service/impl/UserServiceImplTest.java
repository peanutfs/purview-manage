package com.crossrainbow.pm.server.service.impl;

import com.crossrainbow.pm.server.service.entity.User;
import com.crossrainbow.pm.server.service.intf.IUserService;
import com.crossrainbow.pm.web.PmWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 9:52 2020/1/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PmWebApplication.class)
public class UserServiceImplTest {

    @Resource
    private IUserService iUserService;

    @Test
    public void testUserInsert(){
        User user = new User();
        user.setAccountName("操作员");
        user.setIdNo("110101110101010011");
        user.setPassword("123456");
        user.setPhoneNo("13951642151");
        user.setUsername("admin");
        user.setUserSalt("123");
        user.setUserState(1);
        iUserService.insert(user);
    }

    @Test
    public void testUserDelete(){
        iUserService.deleteById(2L);
    }

}
