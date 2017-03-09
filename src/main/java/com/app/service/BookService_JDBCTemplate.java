package com.app.service;

import com.app.dao.BookRepository;
import com.app.dao.Book_JDBCTemplate;
import com.app.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lenovo on 2017/3/8.
 */
@Service
public class BookService_JDBCTemplate {
    @Autowired
    private Book_JDBCTemplate book_jdbcTemplate;

    public Book getBookById(long id){
        return book_jdbcTemplate.getBookById(id);
    }
}
