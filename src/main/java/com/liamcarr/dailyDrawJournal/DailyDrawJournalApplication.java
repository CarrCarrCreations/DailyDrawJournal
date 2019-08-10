package com.liamcarr.dailyDrawJournal;

import com.liamcarr.dailyDrawJournal.model.Greeting;
import com.liamcarr.dailyDrawJournal.repository.GreetingRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DailyDrawJournalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyDrawJournalApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(GreetingRepository greetingRepository) {
        return args -> {
            greetingRepository.save(new Greeting("hello"));
            greetingRepository.save(new Greeting("hi"));
        };
    }
}
