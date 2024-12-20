package com.covoiturage.cvtrg.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    @Email(message = "Invalid email format")
    private String email;


    @Column(nullable = false, length = 20)
    private String role; // CONDUCTOR or PASSENGER

    @Column(nullable = true, precision = 2)
    @Min(value = 0, message = "Rating cannot be negative")
    @Max(value = 5, message = "Rating cannot exceed 5")
    private Double rating;


    public User(Long id, String name, String email, String role, Double rating) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.rating = rating;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public Double getRating() {
        return rating;
    }
}

