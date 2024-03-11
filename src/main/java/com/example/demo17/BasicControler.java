package com.example.demo17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devname")

//java -jar NOMEFILE.jar -Dspring.profiles.active=NOMEPROFILE

public class BasicControler {
    @GetMapping
    public String devName(){
        return "Lisa";
    }
}
