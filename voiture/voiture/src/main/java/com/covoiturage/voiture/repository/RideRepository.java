package com.covoiturage.voiture.repository;

import com.covoiturage.voiture.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {

    // Custom query to find rides by the driver's ID
    List<Ride> findByDriverId(Long driverId);

    // Custom query to find rides by departure location
    List<Ride> findByDeparture(String departure);

    // Custom query to find rides by destination
    List<Ride> findByDestination(String destination);
}
