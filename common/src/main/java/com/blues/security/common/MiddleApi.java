package com.blues.security.common;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author blues
 */
@RequestMapping("/middle")
public interface MiddleApi {

    /**
     * hello
     * @return
     */
    @RequestMapping("hello")
    public String hello();
}
