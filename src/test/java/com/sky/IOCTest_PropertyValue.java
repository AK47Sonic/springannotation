package com.sky;

import com.sky.bean.Person;
import com.sky.config.MainConfigOfLifeCycle;
import com.sky.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Map;

public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);

    private void printBeans(AnnotationConfigApplicationContext ac) {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test01(){

        printBeans(ac);
        Person person = (Person) ac.getBean("person");

        ConfigurableEnvironment environment = ac.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);

        System.out.println(person);
        ac.close();
    }

}
