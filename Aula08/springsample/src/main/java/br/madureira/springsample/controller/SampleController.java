package br.madureira.springsample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//localhost:8080/sample/hello

@RestController
@CrossOrigin("*") //aceita pedido de qualquer origem
@RequestMapping("/sample") //rota para esta classe
public class SampleController {
    
    @GetMapping("/hello") //rota para este método
    public  ResponseEntity<String> ola(){
        return ResponseEntity.ok("Olá Felipe Madureira! Meu primeiro Spring Boot!");
    }
}