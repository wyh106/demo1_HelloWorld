package com.app.service;

import com.app.dao.BookRepository;
import com.app.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lenovo on 2017/3/8.
 */
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void save( Book book){
        bookRepository.save(book);
    }
}
