package com.crossrainbow.pm.server.dao.mapper;

import com.crossrainbow.pm.server.domain.entity.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 17:14 2019/12/25
 */
public interface ResourceMapper {

    /**
     * 根据资源ID查询
     * @param resourceId
     * @return
     */
    Resource selectByResourceId(Long resourceId);

}
