package com.myth.demo02;

import org.junit.Test;

/**
 * @author myth
 * @Date 2020-06-24 17:34
 */
public class Client {
    @Test
    public void Test01(){
        UserService userService = new UserServiceImpl();
        userService.query();
    }

    @Test
    public void Test02(){
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy proxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        proxy.setUserService(userService);
        //实现add方法
        proxy.add();
    }
}
