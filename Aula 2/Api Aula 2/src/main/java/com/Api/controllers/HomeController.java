package com.Api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {

    @GetMapping
    public String ola() {
        return "Olá mundo";
    }

}

/* Verbos do Http
   Get  http://localhost:8080/home
   Post
   Put
   Delete
   Patch
 */