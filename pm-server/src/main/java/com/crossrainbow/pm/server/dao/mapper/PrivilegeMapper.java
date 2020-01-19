package com.crossrainbow.pm.server.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.crossrainbow.pm.server.service.entity.Privilege;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 16:58 2019/12/25
 */
public interface PrivilegeMapper extends BaseMapper<Privilege> {

    /**
     * 根据权限ID查询
     * @param privilegeId
     * @return
     */
    Privilege selectByPrivilegeId(Long privilegeId);
}
