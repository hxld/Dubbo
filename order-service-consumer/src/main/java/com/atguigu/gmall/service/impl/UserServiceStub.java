package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/** 本地存根，可以在启动之前做一些参数验证等工作
 * @author hxld
 * @create 2022-08-16 11:08
 */
public class UserServiceStub implements UserService {
    private  final UserService userService;

    /**
     * 传入的是userservice远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("userServiceStub ....调用成功");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
