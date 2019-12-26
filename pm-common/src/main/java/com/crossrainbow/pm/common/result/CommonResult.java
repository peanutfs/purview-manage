package com.crossrainbow.pm.common.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 18:01 2019/12/24
 */
@Getter
@Setter
@ToString
public class CommonResult {

    /**
     * 返回code
     */
    private String code;

    /**
     * 返回msg
     */
    private String msg;

    /**
     * 返回的body
     */
    private Object body;

    /**
     * 构建通用返回信息
     * @param code
     * @param msg
     */
    public void buildCommResultInfo(String code, String msg){
        this.setCode(code);
        this.setMsg(msg);
    }

    public CommonResult() {
        this.code = "200";
        this.msg = "成功";
    }

    public CommonResult(Object body) {
        this();
        this.body = body;
    }

    public CommonResult(String msg) {
        this.code = "E999";
        this.msg = msg;
    }

    public CommonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
