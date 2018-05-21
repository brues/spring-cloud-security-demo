package com.blues.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MiddleApiService middleApiService;

    @Autowired
    private DatabaseApiService databaseApiService;

    @RequestMapping("hello")
    public String hello(){
        return middleApiService.hello();
    }

    @RequestMapping("good")
    public String good(){
        return databaseApiService.good();
    }
}
