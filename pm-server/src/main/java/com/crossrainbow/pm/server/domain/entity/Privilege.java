package com.crossrainbow.pm.server.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:01 2019/12/25
 */
@Getter
@Setter
@ToString
public class Privilege {

    /**
     * 权限ID
     */
    private Long privilegeId;

    /**
     * 权限编码
     */
    private String privilegeCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 权限资源
     */
    private Resource resource;
}
