package com.tp.spring.boot.freau_pacquteau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    private final
    YellowJacketService service;
    
    @Autowired
    public Controller(YellowJacketService service) {
        this.service = service;
    }
    
    @GetMapping("/country/{pays}")
    public YellowJacket getByPays(@PathVariable("pays") String pays)
    {
        return new YellowJacket(pays, service.getNumberYellowJacket(pays));
    }
}
