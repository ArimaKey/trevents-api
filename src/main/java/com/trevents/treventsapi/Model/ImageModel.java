package com.trevents.treventsapi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "image")
@Entity
public class ImageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private long id;
    private String large_image;
    @Column(nullable = false)
    private String medium_image;
    private String small_image;
}
