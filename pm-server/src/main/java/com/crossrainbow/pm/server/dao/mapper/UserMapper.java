package com.crossrainbow.pm.server.dao.mapper;

import com.crossrainbow.pm.server.domain.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 19:11 2019/12/24
 */
@Repository
public interface UserMapper {
    /**
     * 根据用户查询用户信息
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
