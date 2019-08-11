package com.liamcarr.dailyDrawJournal.controller;

import com.liamcarr.dailyDrawJournal.model.Greeting;
import com.liamcarr.dailyDrawJournal.repository.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private GreetingRepository greetingRepository;

    public HelloController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/api/greetings")
    Iterable<Greeting> getGreetings() {
        System.out.println("Greetings Hit!");
        return greetingRepository.findAll();
    }
}
