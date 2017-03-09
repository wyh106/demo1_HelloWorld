package com.app.dao;

import com.app.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2017/3/8.
 * CrudRepository类把一些常用的方法都已经进行定义和实现了。那么你现在就可以在别的类引入调用了
 *
 */
@ResponseBody
public interface BookRepository extends CrudRepository<Book,Long> {
}
