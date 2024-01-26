package com.example.SpringEsercizio3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class RevereStringController {

    @GetMapping(path = "getname")
    public String getName(@RequestParam String name){
        return name;
    }
    @PostMapping(path = "reversename")
    public StringBuilder reversedName(@RequestParam String name){
        StringBuilder namereverse = new StringBuilder(name);
        return namereverse.reverse();
    }
}
