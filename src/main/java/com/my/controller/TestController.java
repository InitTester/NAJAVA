package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.*;

@Controller
public class TestController {
    @GetMapping("/")
    private String hs() { return "test"; }
}
