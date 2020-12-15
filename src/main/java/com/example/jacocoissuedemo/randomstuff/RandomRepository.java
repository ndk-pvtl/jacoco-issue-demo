package com.example.jacocoissuedemo.randomstuff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomRepository extends JpaRepository<RandomEntity, String> {
}
