package com.sky.config;

import com.sky.bean.Color;
import com.sky.bean.ColorFactoryBean;
import com.sky.bean.Person;
import com.sky.condition.LinuxCondition;
import com.sky.condition.MyImportSelector;
import com.sky.condition.WindowsCondition;
import org.springframework.context.annotation.*;

@Configuration
@Import(value = {Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {
    @Bean("person")
//    @Scope("prototype")
//    @Scope("singleton")
    @Lazy
    public Person person(){
        System.out.println("invoke persion");
        return new Person("Zhangsan", 25);
    }

    @Conditional(value = {WindowsCondition.class})
    @Bean(value = "bill")
    public Person person01(){
        return new Person("Bill Gates", 62);

    }

    @Conditional(value = {LinuxCondition.class})
    @Bean(value = "linus")
    public Person person02() {
        return new Person("Linus", 50);

    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

}
