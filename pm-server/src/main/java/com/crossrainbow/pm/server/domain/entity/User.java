package com.crossrainbow.pm.server.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 19:10 2019/12/24
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
     * 手机号
     */
    private String phoneNo;

    /**
     * 身份证号
     */
    private String idNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户密码盐
     */
    private String userSalt;

    /**
     * 用户状态
     */
    private int userState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 角色
     */
    private String roleName;

    /**
     * 角色集合
     */
    private List<Role> roleSet;

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
