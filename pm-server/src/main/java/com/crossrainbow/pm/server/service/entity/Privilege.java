package com.crossrainbow.pm.server.service.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 10:01 2019/12/25
 */
@Getter
@Setter
@ToString
@TableName(value = "privilege")
public class Privilege extends Model<Privilege> {

    /**
     * 权限ID
     */
    @TableId(value = "privilege_id", type = IdType.AUTO)
    private Long privilegeId;

    /**
     * 权限编码
     */
    @TableField(value = "privilege_code")
    private String privilegeCode;

    /**
     * 权限名称
     */
    @TableField(value = "privilege_name")
    private String privilegeName;

    /**
     * 资源ID
     */
    @TableField(value = "resource_id")
    private Long resourceId;

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
     * 权限资源
     */
    @TableField(exist = false)
    private Resource resource;

    @Override
    protected Serializable pkVal() {
        return this.privilegeId;
    }
}
