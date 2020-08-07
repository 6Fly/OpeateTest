package com.cfam.base.result;

public class ResultUtil {
    public static Result success(Object data){
        Result res = new Result<>();
        res.setCode(ResultEnum.SUCCESS.getCode());
        res.setMsg(ResultEnum.SUCCESS.getMsg());
        res.setData(data);
        return res;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
