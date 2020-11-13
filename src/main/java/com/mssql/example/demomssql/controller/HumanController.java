package com.mssql.example.demomssql.controller;

import com.mssql.example.demomssql.model.Human;
import com.mssql.example.demomssql.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HumanController {

    @Autowired
    HumanRepository repository;

    @GetMapping("/getHumans")
    public List<Human> getHumans(){
        return repository.findAll();
    }
}
