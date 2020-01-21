package com.crossrainbow.pm.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.crossrainbow.pm.server.dao.mapper.RolePrivilegeRelationMapper;
import com.crossrainbow.pm.server.service.entity.RolePrivilegeRelation;
import com.crossrainbow.pm.server.service.intf.IRolePrivilegeRelationService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 15:36 2020/1/20
 */
@Service("rolePrivilegeRelationServiceImpl")
public class RolePrivilegeRelationServiceImpl extends ServiceImpl<RolePrivilegeRelationMapper, RolePrivilegeRelation> implements IRolePrivilegeRelationService {
}
