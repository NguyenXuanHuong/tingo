package com.example.testimage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TestController {
    @GetMapping("test")
    private String test1() {
        return "success1";
    }

    @GetMapping("test2")
    private String test2() {
        return "nam dep trai";
    }
}
