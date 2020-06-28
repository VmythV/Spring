package com.myth.diy;

/**
 * @author myth
 * @Date 2020-06-27 11:11
 */
public class DiyPointCut {

    public void before(){
        System.out.println("---------方法执行前---------");
    }

    public void after(){
        System.out.println("---------方法执行后---------");
    }
}
