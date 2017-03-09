package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by lenovo on 2017/3/9.
 */
@Controller
public class TemplateController {
    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/helloHtml";
    }

    /**
     * 返回FTL模板.
     */
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("hello","from TemplateController.helloFtl");
        return"/helloFtl";
    }
}
