package com.sky.controller;

import com.sky.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookControl {

    @Autowired
    private BookService bookService;
}
