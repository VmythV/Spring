package com.myth.demo03;

import com.myth.demo02.UserService;
import com.myth.demo02.UserServiceImpl;
import org.junit.Test;

/**
 * @author myth
 * @Date 2020-06-24 18:45
 */
public class Client {
    @Test
    public void Test01(){
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }


    @Test
    public void Test02(){
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
