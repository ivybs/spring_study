package com.ibs.demo1;

public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fee();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fee(){
        System.out.println("收中介费");
    }

    public void hetong(){
        System.out.println("签合同");
    }
}
