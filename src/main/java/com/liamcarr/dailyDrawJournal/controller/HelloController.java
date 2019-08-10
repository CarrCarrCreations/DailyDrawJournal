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

    @GetMapping("/")
    String hello() {
        return "hello World";
    }

    @GetMapping("/greetings")
    Iterable<Greeting> getGreetings() {
        return greetingRepository.findAll();
    }
}
