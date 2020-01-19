package com.crossrainbow.pm.server.service.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.crossrainbow.pm.common.enums.UserStateEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
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
@TableName("user")
public class User extends Model<User> {

    /**
     * 用户ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 账户名称
     */
    @TableField(value = "account_name")
    private String accountName;

    /**
     * 手机号
     */
    @TableField(value = "phone_no")
    private String phoneNo;

    /**
     * 身份证号
     */
    @TableField(value = "id_no")
    private String idNo;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 用户密码盐
     */
    @TableField(value = "user_salt")
    private String userSalt;

    /**
     * 用户状态
     */
    @TableField(value = "user_state")
    private int userState;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 角色集合
     */
    private List<Role> roleList;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    public boolean isLocked(){
        return UserStateEnum.LOCKED.getCode() == this.getUserState();
    }
}
