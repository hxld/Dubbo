package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;


/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 * 		2）、配置服务提供者
 * 
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * @author lfy
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	//@Autowired
	@Reference()
//	@Reference(loadbalance = "roundrobin")  //负载均衡，轮询机制，默认其实是随机机制
//	@Reference(url = "127.0.0.1:20881") //绕过注册中心，直接连接提供者的地址
	UserService userService;
//	@HystrixCommand(fallbackMethod = "hello")
	@Override
	public List<UserAddress> initOrder(String userId) {

		System.out.println("用户id："+userId);
		//1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}


//	public List<UserAddress> hello(String userId) {
//
//
//
//		return Arrays.asList(new UserAddress(10,"测试地址","1","测试","测试","y"));
//	}
//

}
