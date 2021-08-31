package com.lzm.springbootLearn.user.controller;

import com.lzm.springbootLearn.user.entity.User;
import com.lzm.springbootLearn.user.service.IUserService;
import com.lzm.springbootLearn.vo.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nd
 * @since 2021-08-31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${weixin.AppId}")
    private String lzm;
    @Autowired
    private IUserService userService;
    //查询用户
    @ApiOperation(value = "getUser")
    @GetMapping("/getUser")
    public Result<User> getUser(@RequestParam Long id) {
        User user = userService.getById(id);
        return Result.okk(user);
    }

    @ApiOperation(value = "test")
    @GetMapping("/test")
    public Result<String> test() {
        return Result.okk(lzm);
    }
}
