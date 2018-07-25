package com.imooc.girl.exception;

import com.imooc.girl.enums.ResultEnum;

/**
 * @Author: Roger
 * @Date: 2018/7/25 14:53
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
