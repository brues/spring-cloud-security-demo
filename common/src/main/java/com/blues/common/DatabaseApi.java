package com.blues.common;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/db")
public interface DatabaseApi {

    @RequestMapping("hello")
    public String hello();

    @RequestMapping("good")
    public String good();
}
