package com.app.dao;



import com.app.domain.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/3/8.
 * 使用JdbcTemplate类操作数据库
 */
@Repository
public class Book_JDBCTemplate {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Book getBookById(long id){
        String sql="select * from book where id=?";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<Book>(Book.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }


}
