package com.example.holamundoBS0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()

public class holamundo {

    @GetMapping("/holamundo")

    public String holamundo(){
        return "Hola mundo";
    }
}

