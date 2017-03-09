package com.app.web;

import com.app.domain.Book;
import com.app.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/3/8.
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;

    /**
     * 测试Hibernate保存数据
     *
     * @return
     */
    @RequestMapping("/savebook")
    public String saveBook() {
        Book book = new Book();
        book.setName("三国演义");
        book.setNumber(5);
        bookService.save(book);
        return "ok.BookController.save";
    }


    @RequestMapping("/getbook")
    public Book bookInfo() {
        Book book = new Book();
        book.setName("三国演义");
        book.setNumber(5);
        // 这里springBoot自带了jackJson的json转换器
        return book;
    }

    /*@RequestMapping("/querybook")
    public  String getBook(){
        Book book = new Book();
        book.setName("三国演义");
        book.setNumber(5);
        // 这里springBoot自带了jackJson的json转换器
        return JSONObject.toJSONString(book);
    }*/
}

