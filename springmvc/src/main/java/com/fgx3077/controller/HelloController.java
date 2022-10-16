package com.fgx3077.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(this.getClass().getName()+"----------");
        //1.创建视图对象
        ModelAndView mv=new ModelAndView();
        //2.添加视图名称,要跳转页面的名称
        mv.setViewName("hello");
        //3.向前端页面添加属性值
        mv.addObject("hello", "hello.springmvc");
        return mv;
    }
}
