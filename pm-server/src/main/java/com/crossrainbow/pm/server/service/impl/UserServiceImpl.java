package com.crossrainbow.pm.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.crossrainbow.pm.server.dao.mapper.UserMapper;
import com.crossrainbow.pm.server.service.entity.User;
import com.crossrainbow.pm.server.service.intf.IUserService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:41 2019/12/27
 */
@Service("userServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public User selectByUsername(String username) {
        return this.baseMapper.selectByUsername(username);
    }
}
