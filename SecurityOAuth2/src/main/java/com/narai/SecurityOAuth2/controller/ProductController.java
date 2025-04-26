package com.narai.SecurityOAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping
    public String getAllProducts(){
        return "Getting all products";
    }

    @GetMapping("/unauthorised")
    public String unauthorisedEndpoint(){
        return "Its not behind Authentication";
    }
}
