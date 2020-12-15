package com.example.jacocoissuedemo.randomstuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RandomService {
    private RandomRepository randomRepository;

    public RandomService(@Autowired RandomRepository randomRepository) {
        this.randomRepository = randomRepository;
    }

    @Transactional
    public void saveStuff() {
        RandomEntity randomEntity = new RandomEntity("Random", "Entity", "Job");
        randomRepository.save(randomEntity);
    }

    public List<RandomEntity> readStuff() {
        return randomRepository.findAll();
    }
}
