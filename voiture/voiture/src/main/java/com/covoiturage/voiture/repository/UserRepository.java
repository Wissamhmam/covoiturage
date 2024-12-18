package com.covoiturage.voiture.repository;

import com.covoiturage.voiture.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query to find a user by username
    Optional<User> findByUsername(String username);

    // Custom query to find a user by email
    Optional<User> findByEmail(String email);

    // Custom query to find a user by role (for example DRIVER or PASSENGER)
    Optional<User> findByRole(String role);
}
