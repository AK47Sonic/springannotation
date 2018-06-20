package com.sky.config;

import com.sky.bean.Car;
import com.sky.bean.Color;
import com.sky.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.sky.controller","com.sky.dao","com.sky.service","com.sky.bean"})
public class MainConfigOfAutoWired {

//    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }

    @Bean
    public Color color(@Autowired Car car) {
        Color color = new Color();
        color.setCar(car);
        return color;
    }

}
