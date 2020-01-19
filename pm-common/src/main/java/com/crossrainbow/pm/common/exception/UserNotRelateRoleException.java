package com.crossrainbow.pm.common.exception;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:48 2019/12/27
 */
public class UserNotRelateRoleException extends CommonException{
    public UserNotRelateRoleException(String errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
