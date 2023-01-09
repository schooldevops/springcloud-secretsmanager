package com.ccsexample.secretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${DB_URL}")
    String dbpassword;

    @Value("${DB_PORT}")
    String dbusername;

    @GetMapping("/test")
    public String getValue() {
        return dbpassword + ":" + dbusername;
    }
}
