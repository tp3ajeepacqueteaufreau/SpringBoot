package com.tp.spring.boot.freau_pacquteau;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class YellowJacketService {
    private Map<String, Integer> number;
    
    @PostConstruct
    public void postInit() {
        number = new HashMap<>();
    }
    
    int getNumberYellowJacket(String pays){
        int ret = number.getOrDefault(pays, 0);
        number.put(pays, ret + 1000);
        return ret;
    }
}
