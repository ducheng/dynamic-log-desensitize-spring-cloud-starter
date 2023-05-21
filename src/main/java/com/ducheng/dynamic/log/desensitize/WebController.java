package com.ducheng.dynamic.log.desensitize;

import com.ducheng.dynamic.log.desensitize.entity.BookEntity;
import com.ducheng.dynamic.log.desensitize.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

    @Autowired
    private BookService bookService;

    //DataSourceAutoConfiguration
    @GetMapping("/index")
    public String index() {
        return "5555"+"88888";
    }

    @GetMapping("/list")
    public List<BookEntity> list() {
        return bookService.getList();
    }
}
