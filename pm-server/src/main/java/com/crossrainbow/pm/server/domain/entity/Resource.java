package com.crossrainbow.pm.server.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 16:34 2019/12/25
 */
@Getter
@Setter
@ToString
public class Resource {

    /**
     * 资源ID
     */
    private Long resourceId;

    /**
     * 父资源ID
     */
    private Long parentResourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源编码
     */
    private String resourceCode;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 资源Url
     */
    private String resourceUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
