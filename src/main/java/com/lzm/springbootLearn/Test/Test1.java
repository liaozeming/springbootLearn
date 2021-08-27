package com.lzm.springbootLearn.Test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年08月27日 15:31
 */
@RestController
@RequestMapping("/user")
@Validated
@Slf4j
@Api(value = "LoginController", tags = "用户登录")
public class Test1 {

    @ApiOperation(value = "ping")
    @GetMapping("/ping")
    @ApiImplicitParams({
    })
    public Result<String> ping() {

        return Result.okk("ok");
    }


}
