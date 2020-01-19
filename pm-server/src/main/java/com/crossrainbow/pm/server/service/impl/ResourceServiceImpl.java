package com.crossrainbow.pm.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.crossrainbow.pm.server.dao.mapper.ResourceMapper;
import com.crossrainbow.pm.server.service.entity.Resource;
import com.crossrainbow.pm.server.service.intf.IResourceService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:49 2019/12/27
 */
@Service("resourceServiceImpl")
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {
}
