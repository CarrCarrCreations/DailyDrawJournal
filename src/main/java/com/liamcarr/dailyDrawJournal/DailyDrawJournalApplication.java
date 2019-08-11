package com.liamcarr.dailyDrawJournal;

import com.liamcarr.dailyDrawJournal.model.Greeting;
import com.liamcarr.dailyDrawJournal.repository.GreetingRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DailyDrawJournalApplication {
//    https://www.youtube.com/watch?v=KDK5xXPJVIg deploying to Heroku
//    https://wiki.jenkins.io/display/JENKINS/Installing+Jenkins+with+Docker Jenkins Docker
//    docker ps; docker exec -it <mycontainer> bash   get container name and SSH into docker container
//    https://devops4solutions.com/ci-cd-using-jenkins-heroku/ setup jenkins heroku pipeline
//    https://www.baeldung.com/spring-boot-h2-database Setup and use H2 database

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
