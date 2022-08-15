package com.atguigu.gmall;

import javafx.application.Application;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author hxld
 * @create 2022-08-15 14:44
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        //为了不让程序终止,在这阻塞读取一个字符
        System.in.read();

    }
}
