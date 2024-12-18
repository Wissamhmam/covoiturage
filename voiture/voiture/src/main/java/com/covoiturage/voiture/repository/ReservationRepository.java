package com.covoiturage.voiture.repository;

import com.covoiturage.voiture.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    // Custom query to find reservations by ride ID
    List<Reservation> findByRideId(Long rideId);

    // Custom query to find reservations by passenger ID
    List<Reservation> findByPassengerId(Long passengerId);
}
