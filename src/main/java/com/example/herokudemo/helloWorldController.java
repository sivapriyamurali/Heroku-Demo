package com.example.herokudemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class helloWorldController
{

    @GetMapping("/hello")
    String home()
    {
        return "Hello world";
    }

}
