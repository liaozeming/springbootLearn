package com.lzm.springbootLearn.Test;

/**
 * 全局返回状态码
 * @author hejinwu
 */
public interface GlobalReturnCode {

    /**
     * 全局成功码
     */
    Integer SC_OK_200 = 0;

    /**
     * 系统错误
     */
    Integer SYS_ERROR = 500;
    /**
     * 访问权限认证未通过
     */
    Integer SC_JEECG_NO_AUTHZ = 510;

    Integer SC_OK_404 = 404;
    /**
     * 请求类型错误
     */
    Integer SC_OK_405 = 405;

    /**
     * 业务类型异常
     */
    Integer SERVICE_ERROR_CODE = 600;
    /**
     * 参数类型错误
     */
    Integer PARAM_EXCEPTION_CODE = 700;
    /**
     * token类型错误
     */
    Integer TOKEN_ERROR = 800;
    /**
     * 操作权限异常
     */
    Integer AUTH_ERROR = 900;
}
