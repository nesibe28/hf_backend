package com.healthfriend.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Calendar {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Date date; //Format kann man sich selber festlegen mit wochentag usw.

    private String event;
}
