package com.myth.demo01;

/**
 * @author myth
 * @Date 2020-06-22 18:42
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    //租房
    public void rent() {
        host.rent();
        seeHouse();
        free();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void free(){
        System.out.println("收中介费");
    }
}
