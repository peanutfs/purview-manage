package com.crossrainbow.pm.server.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.crossrainbow.pm.server.service.entity.Role;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 16:42 2019/12/25
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据角色ID查询角色信息
     * @param roleId
     * @return
     */
    Role selectByRoleId(Long roleId);

}
