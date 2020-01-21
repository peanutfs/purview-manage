package com.crossrainbow.pm.server.service.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:01 2020/1/20
 */
@Getter
@Setter
@TableName("user_role_relation")
public class UserRoleRelation extends Model<UserRoleRelation> {

    /**
     * 主键id
     */
    @TableId(value = "urr_id", type = IdType.AUTO)
    private Long urrId;

    /**
     * 用户Id
     */
    @TableField(value = "urr_user_id")
    private Long urrUserId;

    /**
     * 角色id
     */
    @TableField(value = "urr_role_id")
    private Long urrRoleId;

    /**
     * 创建时间
     */
    @TableField(value = "urr_create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "urr_update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return this.urrId;
    }
}
