package com.example.docker_task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping
    public String function(){
        return "Hello from Vm";
    }
}
