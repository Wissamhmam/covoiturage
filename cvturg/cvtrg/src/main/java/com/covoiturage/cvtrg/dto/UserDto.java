package com.covoiturage.cvtrg.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String role; // DRIVER or PASSENGER
    private Double rating;

    public UserDto(Long id, String name, String email, String role, Double rating) {
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

