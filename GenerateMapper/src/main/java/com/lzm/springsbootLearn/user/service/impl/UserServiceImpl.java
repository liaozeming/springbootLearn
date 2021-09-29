package com.lzm.springsbootLearn.user.service.impl;

import com.lzm.springsbootLearn.user.entity.User;
import com.lzm.springsbootLearn.user.mapper.UserMapper;
import com.lzm.springsbootLearn.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nd
 * @since 2021-08-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
