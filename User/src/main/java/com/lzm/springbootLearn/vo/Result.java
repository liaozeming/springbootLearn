package com.lzm.springbootLearn.vo;

import com.lzm.springbootLearn.error.ErrorConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口返回数据格式
 *
 * @author scott
 * @email jeecgos@163.com
 * @date 2019年1月19日
 */
@Data
@ApiModel(value = "接口返回对象", description = "接口返回对象")
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功标志
     */
    @ApiModelProperty(value = "成功标志")
    private boolean success = true;

    /**
     * 返回处理消息
     */
    @ApiModelProperty(value = "返回处理消息")
    private String errmsg = "操作成功！";

    /**
     * 返回代码
     */
    @ApiModelProperty(value = "返回代码")
    private Integer errcode = GlobalReturnCode.SC_OK_200;

    /**
     * 返回数据对象 data
     */
    @ApiModelProperty(value = "返回数据对象")
    private T data;

    /**
     * 时间戳
     */
    @ApiModelProperty(value = "时间戳")
    private long timestamp = System.currentTimeMillis();

    public Result() {

    }

    public Result<T> success(String message) {
        this.errmsg = message;
        this.errcode = GlobalReturnCode.SC_OK_200;
        this.success = true;
        return this;
    }

    public static <T> Result<T> ok() {
        Result<T> r = new Result<>();
        r.setSuccess(true);
        r.setErrcode(GlobalReturnCode.SC_OK_200);
        r.setErrmsg("成功");
        return r;
    }

    public static <T> Result<T> okMsg(String msg) {
        Result<T> r = new Result<>();
        r.setSuccess(true);
        r.setErrcode(GlobalReturnCode.SC_OK_200);
        r.setErrmsg(msg);
        return r;
    }


    public static <T> Result<T> ok(T t) {
        Result<T> r = new Result<T>();
        r.setSuccess(true);
        r.setErrcode(GlobalReturnCode.SC_OK_200);
        r.setData(t);
        return r;
    }

    public static <T> Result<T> ok(T t,String msg) {
        Result<T> r = new Result<T>();
        r.setSuccess(true);
        r.setErrmsg(msg);
        r.setErrcode(GlobalReturnCode.SC_OK_200);
        r.setData(t);
        return r;
    }


    public static <T> Result<T> okk(T t) {
        Result<T> r = new Result<T>();
        r.setSuccess(true);
        r.setErrcode(GlobalReturnCode.SC_OK_200);
        r.setData(t);
        return r;
    }

    public static <T> Result<T> error(String msg) {
        return error(GlobalReturnCode.SYS_ERROR, msg);
    }

/*    public static <T> Result<T> error(String msg, T data) {
        return error(GlobalReturnCode.SYS_ERROR, msg, data);
    }*/

    public static <T> Result<T> error(int code, String msg) {
        Result<T> r = new Result<>();
        r.setErrcode(code);
        r.setErrmsg(msg);
        r.setSuccess(false);
        return r;
    }

/*    public static <T> Result<T> error(int code, String msg, T data) {
        Result<T> r = new Result<>();
        r.setErrcode(code);
        r.setErrmsg(msg);
        r.setSuccess(false);
        r.setData(data);
        return r;
    }*/

    public static <T> Result<T> error(ErrorConfig errorConfig) {
        Result<T> r = new Result<>();
        r.setErrcode(errorConfig.getCode());
        r.setErrmsg(errorConfig.getMsg());
        r.setSuccess(false);
        return r;
    }

/*    public static <T> Result<T> error(ErrorConfig errorConfig, T data) {
        Result<T> r = new Result<>();
        r.setErrcode(errorConfig.getCode());
        r.setErrmsg(errorConfig.getMsg());
        r.setSuccess(false);
        r.setData((T) data);
        return r;
    }*/

    public Result<T> error500(String message) {
        this.errmsg = message;
        this.errcode = GlobalReturnCode.SYS_ERROR;
        this.success = false;
        return this;
    }

    /**
     * 无权限访问返回结果
     */
    public static Result<Object> noauth(String msg) {
        return error(GlobalReturnCode.SC_JEECG_NO_AUTHZ, msg);
    }
}