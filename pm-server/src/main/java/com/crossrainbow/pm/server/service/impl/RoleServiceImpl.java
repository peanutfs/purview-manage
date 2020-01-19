package com.crossrainbow.pm.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.crossrainbow.pm.server.dao.mapper.RoleMapper;
import com.crossrainbow.pm.server.service.entity.Role;
import com.crossrainbow.pm.server.service.intf.IRoleService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:05 2019/12/27
 */
@Service("roleServiceImpl")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
}
