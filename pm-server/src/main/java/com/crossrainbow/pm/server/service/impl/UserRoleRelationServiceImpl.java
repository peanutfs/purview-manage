package com.crossrainbow.pm.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.crossrainbow.pm.server.dao.mapper.UserRoleRelationMapper;
import com.crossrainbow.pm.server.service.entity.UserRoleRelation;
import com.crossrainbow.pm.server.service.intf.IUserRoleRelationService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:10 2020/1/20
 */
@Service("userRoleRelationServiceImpl")
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationMapper, UserRoleRelation> implements IUserRoleRelationService {
}
