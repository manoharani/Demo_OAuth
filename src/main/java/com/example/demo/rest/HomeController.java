package com.example.demo.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/demo")
public class HomeController {

    @GetMapping(value = "/home")
    public ResponseEntity<String> testMethod(){
        return ResponseEntity.status(HttpStatus.OK).body("Home Controller Invoked");
    }


}
