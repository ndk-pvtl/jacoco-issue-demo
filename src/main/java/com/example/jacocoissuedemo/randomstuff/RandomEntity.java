package com.example.jacocoissuedemo.randomstuff;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class RandomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    @NonNull
    String firstName;
    @NonNull
    String lastName;
    @NonNull
    String job;
}
