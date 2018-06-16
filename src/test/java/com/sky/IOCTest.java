package com.sky;

import com.sky.bean.Person;
import com.sky.config.MainConfig;
import com.sky.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IOCTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void testImport() {
        printBeans(ac);
        Object colorFactoryBean = ac.getBean("colorFactoryBean");
        Object colorFactoryBean2 = ac.getBean("colorFactoryBean");
        System.out.println(colorFactoryBean==colorFactoryBean2);
        System.out.println(colorFactoryBean.getClass());

        Object colorFactoryBean3 = ac.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean3.getClass());
    }

    private void printBeans(AnnotationConfigApplicationContext ac) {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test03() {
        ConfigurableEnvironment environment = ac.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        String[] beanNamesForType = ac.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
        Map<String, Person> beansOfType = ac.getBeansOfType(Person.class);
        System.out.println(beansOfType);


    }

    @Test
    public void test02() {
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//        for (String name: beanDefinitionNames){
//            System.out.println(name);
//        }
        System.out.println("ioc container created");
        Object person = ac.getBean("person");
        Object person2 = ac.getBean("person");
        System.out.println(person == person2);
    }

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
