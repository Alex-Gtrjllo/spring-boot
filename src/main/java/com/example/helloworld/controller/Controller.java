package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Hello, World!");
        map.put("author", "Alexis Trujillo");

        return map;
    }
}
