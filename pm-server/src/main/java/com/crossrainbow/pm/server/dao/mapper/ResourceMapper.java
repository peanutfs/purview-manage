package com.crossrainbow.pm.server.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.crossrainbow.pm.server.service.entity.Resource;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 17:14 2019/12/25
 */
public interface ResourceMapper extends BaseMapper<Resource> {

    /**
     * 根据资源ID查询
     * @param resourceId
     * @return
     */
    Resource selectByResourceId(Long resourceId);

}
