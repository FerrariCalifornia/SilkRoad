package com.cc.controller;

import com.cc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cc on 2017/2/27.
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping(value = "/book",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        System.out.println(bookService.findAll());

        return "this is BookController!!!!!!";
    }
}
