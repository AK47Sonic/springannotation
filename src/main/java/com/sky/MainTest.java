package com.sky;

import com.sky.bean.Person;
import com.sky.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) ac.getBean("person");
//        System.out.println(person);
        ApplicationContext aca = new AnnotationConfigApplicationContext(MainConfig.class);
//        通过类型获取
        Person person = aca.getBean(Person.class);
        System.out.println(person);
//        通过id/name获取
        Person person2 = (Person) aca.getBean("personId2");
        System.out.println(person2);
        String[] personType = aca.getBeanNamesForType(Person.class);
        for (int i = 0; i < personType.length; i++) {
            System.out.println(personType[i]);
        }


    }
}
