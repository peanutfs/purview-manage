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
 * @date:created in 16:34 2019/12/25
 */
@Getter
@Setter
@ToString
@TableName(value = "resources")
public class Resource extends Model<Resource> {

    /**
     * 资源ID
     */
    @TableId(value = "resource_id", type = IdType.AUTO)
    private Long resourceId;

    /**
     * 父资源ID
     */
    @TableField(value = "parent_resources_id")
    private Long parentResourceId;

    /**
     * 资源名称
     */
    @TableField(value = "resource_name")
    private String resourceName;

    /**
     * 资源编码
     */
    @TableField(value = "resource_code")
    private String resourceCode;

    /**
     * 资源类型
     */
    @TableField(value = "resource_type")
    private String resourceType;

    /**
     * 资源Url
     */
    @TableField(value = "resource_url")
    private String resourceUrl;

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

    @Override
    protected Serializable pkVal() {
        return this.resourceId;
    }
}
