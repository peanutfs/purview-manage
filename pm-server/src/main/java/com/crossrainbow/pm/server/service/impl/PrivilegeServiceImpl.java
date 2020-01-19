package com.crossrainbow.pm.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.crossrainbow.pm.server.dao.mapper.PrivilegeMapper;
import com.crossrainbow.pm.server.service.entity.Privilege;
import com.crossrainbow.pm.server.service.intf.IPrivilegeService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:08 2019/12/27
 */
@Service("privilegeServiceImpl")
public class PrivilegeServiceImpl extends ServiceImpl<PrivilegeMapper, Privilege> implements IPrivilegeService {
}
