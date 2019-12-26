package com.crossrainbow.pm.server.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 9:56 2019/12/25
 */
@Getter
@Setter
@ToString
public class Role {

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型
     */
    private String roleType;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 权限集合
     */
    private List<Privilege> privilegeList;
}
