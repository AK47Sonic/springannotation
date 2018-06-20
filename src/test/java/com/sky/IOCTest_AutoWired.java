package com.sky;

import com.sky.bean.Boss;
import com.sky.bean.Car;
import com.sky.bean.Color;
import com.sky.config.MainConfigOfAutoWired;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_AutoWired {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigOfAutoWired.class);

    private void printBeans(AnnotationConfigApplicationContext ac) {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test01(){
//        BookService bookService = ac.getBean(BookService.class);
//        System.out.println(bookService);
//        BookDao bookDao = ac.getBean(BookDao.class);
//        System.out.println(bookDao);
        Boss boss = ac.getBean(Boss.class);
        System.out.println(boss);
        Car car = ac.getBean(Car.class);
        System.out.println(car);

        Color color = ac.getBean(Color.class);
        System.out.println(color);
        System.out.println(ac);
        ac.close();
    }

}
