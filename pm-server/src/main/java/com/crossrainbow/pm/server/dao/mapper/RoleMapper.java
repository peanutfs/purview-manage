package com.crossrainbow.pm.server.dao.mapper;

import com.crossrainbow.pm.server.domain.entity.Role;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 16:42 2019/12/25
 */
public interface RoleMapper {

    /**
     * 根据角色ID查询角色信息
     * @param roleId
     * @return
     */
    Role selectByRoleId(Long roleId);

}
