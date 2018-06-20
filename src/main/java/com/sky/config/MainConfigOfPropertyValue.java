package com.sky.config;

import com.sky.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:person.properties"})
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }

}
