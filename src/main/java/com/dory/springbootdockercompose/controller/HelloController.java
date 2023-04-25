package com.dory.springbootdockercompose.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }
}