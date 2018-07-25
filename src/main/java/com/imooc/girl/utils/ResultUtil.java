package com.imooc.girl.utils;

import com.imooc.girl.domain.Result;

/**
 * @Author: Roger
 * @Date: 2018/7/25 14:15
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
