package com.crossrainbow.pm.server.service.intf;

import com.baomidou.mybatisplus.service.IService;
import com.crossrainbow.pm.server.service.entity.User;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:40 2019/12/27
 */
public interface IUserService extends IService<User> {

    /**
     * 根据用户查询用户信息
     * @param username
     * @return
     */
    User selectByUsername(String username);

}
