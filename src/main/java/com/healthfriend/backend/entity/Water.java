package com.healthfriend.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Water {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private int glasses;
}
