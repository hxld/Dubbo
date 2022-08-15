package com.atguigu.gmall;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.attribute.standard.OrientationRequested;
import java.io.IOException;

/**
 * @author hxld
 * @create 2022-08-15 15:27
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("调用结束....");

        //阻塞下看清楚结果
        System.in.read();
    }
}
