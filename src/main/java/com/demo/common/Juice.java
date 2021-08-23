package com.demo.common;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Juice {
private String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public Juice(String flavour) {
        this.flavour = flavour;
    }

    public Juice() {
    }

    @Override
    public String toString() {
        return "Juice{" +
                "flavour='" + flavour + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting Method");
    }
    @PreDestroy
    public void end(){
        System.out.println("Ending Method");
    }
}
