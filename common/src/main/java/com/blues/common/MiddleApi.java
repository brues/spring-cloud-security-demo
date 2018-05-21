package com.blues.common;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/middle")
public interface MiddleApi {

    @RequestMapping("hello")
    public String hello();
}
