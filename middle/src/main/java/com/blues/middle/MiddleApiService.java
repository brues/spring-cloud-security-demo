package com.blues.middle;

import com.blues.common.MiddleApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiddleApiService implements MiddleApi {

    @Autowired
    private DatabaseApiService databaseApiService;

    @Override
    public String hello() {
        return databaseApiService.hello();
    }
}
