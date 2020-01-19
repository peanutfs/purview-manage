package com.crossrainbow.pm.common.enums;

import lombok.Getter;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:59 2019/12/27
 */
@Getter
public enum ResponseErrorEnum {

    /**
     * L000:用户未关联角色
     */
    USER_NOT_RELATE_ROLE("L000", "用户未关联角色");



    ResponseErrorEnum(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误信息
     */
    private String msg;

}
