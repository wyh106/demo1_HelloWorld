package com.app.web;

import com.app.domain.Book;
import com.app.service.BookService;
import com.app.service.BookService_JDBCTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/3/8.
 */
@RestController
@RequestMapping("/book2")
public class BookController_JDBCTemplate {
    @Resource
    private BookService_JDBCTemplate bookService_jdbcTemplate;

    @RequestMapping("/getBookById")
    public Book bookInfo(Long id) {
        return bookService_jdbcTemplate.getBookById(id);
    }


}

