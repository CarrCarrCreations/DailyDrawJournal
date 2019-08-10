package com.liamcarr.dailyDrawJournal.repository;

import com.liamcarr.dailyDrawJournal.model.Greeting;
import org.springframework.data.repository.CrudRepository;


public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}
