package com.myth.demo01;

import org.junit.Test;

/**
 * @author myth
 * @Date 2020-06-22 18:44
 */

//这是使用代理模式
public class Client02 {
    @Test
    public void Test01(){
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
