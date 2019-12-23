package com.crossrainbow.pm.server.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 12:00 2019/12/23
 */
@Getter
@Setter
@ToString
public class User {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phoneNo;

    /**
     * 身份证号
     */
    private String idNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 角色集合
     */
    private String roleName;

    /**
     * 用户是否锁定
     */
    private boolean isLocked;

    public User(Long userId, String username, String password, String roleName, boolean isLocked){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.roleName = roleName;
        this.isLocked = isLocked;
    }
}
