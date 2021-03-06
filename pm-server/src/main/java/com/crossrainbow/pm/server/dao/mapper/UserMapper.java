package com.crossrainbow.pm.server.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.crossrainbow.pm.server.service.entity.User;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 19:11 2019/12/24
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据用户查询用户信息
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
