package com.kz.digitalcontrol.controller;

import com.kz.digitalcontrol.model.Main;
import com.kz.digitalcontrol.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MainRepository mainRepository;

    @RequestMapping("/read/iterable")
    public List<Main> readMainIterable(){
        return mainRepository.findAll();
    }
}
