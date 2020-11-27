package com.asir.commons.entities;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author asir
 * @date 2020/10/28 - 9:13
 */
@Data
public class Result {
    private final  static  Integer SUCCESS=20000;//成功返回结果
    private final  static  Integer ERROR=20001;//成功返回结果

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    private Result(){};

    public static Result Ok(){
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(Result.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    public static Result Error(){
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(Result.ERROR);
        r.setMessage("失败");
        return r;
    }

    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
