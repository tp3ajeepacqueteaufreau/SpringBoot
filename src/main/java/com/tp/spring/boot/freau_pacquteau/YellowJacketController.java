package com.tp.spring.boot.freau_pacquteau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class YellowJacketController {
    
    @GetMapping("/")
    public String hello(){
        return "index.html";
    }
}
