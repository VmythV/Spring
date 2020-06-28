package com.myth.demo01;

import org.junit.Test;

/**
 * @author myth
 * @Date 2020-06-22 18:39
 */

//这是没有用代理模式
public class Client01 {
    @Test
    public void Test01(){
        Host host = new Host();
        host.rent();
    }


}
