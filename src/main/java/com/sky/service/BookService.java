package com.sky.service;

import com.sky.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    @Autowired(required = false)
//    @Qualifier("bookDao")
//    @Resource(name = "bookDao2") //默认按照组件名称进行装配的,@Primary不支持,没有required功能
//    @Inject //支持@Primary,没有required功能
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
