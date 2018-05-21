package com.blues.security.common;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author blues
 */
@RequestMapping("/database")
public interface DatabaseApi {

    /**
     * hello
     * @return
     */
    @RequestMapping("hello")
    public String hello();


    /**
     * good
     * @return
     */
    @RequestMapping("good")
    public String good();
}
