package com.tp.spring.boot.freau_pacquteau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    
    
    @GetMapping("/country/{pays}")
    public String getByPays(@PathVariable("pays") String pays)
    {
        return pays;
    }
}
