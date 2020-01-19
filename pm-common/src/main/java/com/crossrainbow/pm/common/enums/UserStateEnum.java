package com.crossrainbow.pm.common.enums;

import lombok.Getter;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:16 2019/12/27
 */
@Getter
public enum UserStateEnum {

    /**
     * 0：锁定
     */
    LOCKED(0, "锁定"),

    /**
     * 1:正常
     */
    NORMAL(1, "正常");


    UserStateEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    /**
     * 编码
     */
    private int code;

    /**
     * 描述
     */
    private String desc;
}
