package com.trevents.treventsapi.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class CategoryModel {
    @Id
    @Column(nullable = false, unique = true)
    private int id;

}
