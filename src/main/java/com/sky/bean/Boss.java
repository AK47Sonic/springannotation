package com.sky.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

//    @Autowired
    public Boss(@Autowired Car car) {
        this.car = car;
        System.out.println("----------Boss 1 constructor----------");
    }

    private Car car;

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }


    public Car getCar() {
        System.out.println("------Call getCar-------------");
        return car;
    }

//    @Autowired
    public void setCar(Car car) {
        System.out.println("------Call setCar-------------");
        this.car = car;
    }
}
