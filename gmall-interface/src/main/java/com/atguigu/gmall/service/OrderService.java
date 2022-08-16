package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author hxld
 * @create 2022-08-15 10:48
 */
public interface OrderService {
    /**
     * 初始化订单
     */
    public List<UserAddress> initOrder(String userId) ;
}
