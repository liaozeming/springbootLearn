package com.lzm.springbootLearn.error;

/**
 * @author hejinwu
 */
public interface ErrorConfigInterface {
    /**
     * 错误编码
     * @return
     */
    Integer getCode();

    /**
     * 错误信息
     * @return
     */
    String getMsg();
}
