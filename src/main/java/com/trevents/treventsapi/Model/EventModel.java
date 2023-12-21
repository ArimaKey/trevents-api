package com.trevents.treventsapi.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Category;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String place;
    private String organizator;
    @Column(nullable = false)
    private boolean isFree;
    LocalDate time;
    private boolean premium;
    private LocalDate start_promotion;
    private LocalDate end_promotion;
    private ArrayList<Category> categories;

}