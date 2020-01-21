package com.crossrainbow.pm.server.service.impl;

import com.crossrainbow.pm.common.enums.ResourceTypeEnum;
import com.crossrainbow.pm.server.service.entity.Resource;
import com.crossrainbow.pm.server.service.intf.IResourceService;
import com.crossrainbow.pm.web.PmWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @description:
 * @author:Peanutfs
 * @date:created in 17:05 2020/1/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PmWebApplication.class)
public class ResourceServiceImplTest {

    @javax.annotation.Resource
    private IResourceService iResourceService;

    @Test
    public void testResourceInsert(){
        Resource resource = new Resource();
        resource.setParentResourceId(1L);
        resource.setResourceName("系统管理");
        resource.setResourcePriority(0);
        resource.setResourceType(ResourceTypeEnum.DIRECTORY.getCode());
        iResourceService.insert(resource);
    }
}
