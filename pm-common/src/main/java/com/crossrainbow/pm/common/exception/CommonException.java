package com.crossrainbow.pm.common.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:48 2019/12/27
 */
@Getter
@Setter
@ToString
public class CommonException extends RuntimeException{

    private String errCode;

    private String errMsg;

    public CommonException(String errCode, String errMsg) {
        super();
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

}
