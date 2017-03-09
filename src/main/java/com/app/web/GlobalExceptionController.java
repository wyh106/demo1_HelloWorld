package com.app.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/3/8.
 */
@RestController
public class GlobalExceptionController {
    @RequestMapping("/globalexception")
    public  int getBook(){
        return 100/0;
    }
}
