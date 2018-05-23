package com.blues.db;
import com.blues.security.common.DatabaseApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseApiService implements DatabaseApi {
    @Override
    public String good() {
        return "good  db   main";
    }

    @Override
    public String hello() {
        return "hello  db  middle  main";
    }
}
