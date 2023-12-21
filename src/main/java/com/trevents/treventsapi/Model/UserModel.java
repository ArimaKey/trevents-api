package com.trevents.treventsapi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_profile")
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String name;

    private int image;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private LocalDate birthdate;
    private int role_id;


}
