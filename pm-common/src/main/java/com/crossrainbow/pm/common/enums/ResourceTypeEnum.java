package com.crossrainbow.pm.common.enums;

import lombok.Getter;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 17:09 2020/1/20
 */
@Getter
public enum ResourceTypeEnum {


    /**
     * 目录
     */
    DIRECTORY("directory", "目录"),

    /**
     * 菜单
     */
    MENU("menu", "菜单"),

    /**
     * 按钮
     */
    BUTTON("button", "按钮");


    ResourceTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    private String code;

    private String desc;
}
