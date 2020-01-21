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
 * @date:created in 15:24 2020/1/20
 */
@Getter
@Setter
@TableName("role_privilege_relation")
public class RolePrivilegeRelation extends Model<RolePrivilegeRelation> {

    /**
     * 主键ID
     */
    @TableId(value = "rpr_id", type = IdType.AUTO)
    private Long rprId;

    /**
     * 角色ID
     */
    @TableField(value = "rpr_role_id")
    private Long rprRoleId;

    /**
     * 权限ID
     */
    @TableField(value = "rpr_privilege_id")
    private Long rprPrivilegeId;

    /**
     * 创建时间
     */
    @TableField(value = "rpr_create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "rpr_update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return this.rprId;
    }
}
