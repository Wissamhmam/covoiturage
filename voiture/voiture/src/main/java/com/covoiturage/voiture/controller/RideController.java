package com.covoiturage.voiture.controller;

import com.covoiturage.voiture.entity.Ride;
import com.covoiturage.voiture.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    @Autowired
    private RideRepository rideRepository;

    // Get all rides
    @GetMapping
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    // Get a specific ride by ID
    @GetMapping("/{id}")
    public ResponseEntity<Ride> getRideById(@PathVariable Long id) {
        Optional<Ride> ride = rideRepository.findById(id);
        return ride.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get rides by driver ID
    @GetMapping("/driver/{driverId}")
    public List<Ride> getRidesByDriverId(@PathVariable Long driverId) {
        return rideRepository.findByDriverId(driverId);
    }

    // Create a new ride
    @PostMapping
    public ResponseEntity<Ride> createRide(@RequestBody Ride ride) {
        Ride savedRide = rideRepository.save(ride);
        return new ResponseEntity<>(savedRide, HttpStatus.CREATED);
    }

    // Update an existing ride
    @PutMapping("/{id}")
   /** public ResponseEntity<Ride> updateRide(@PathVariable Long id, @RequestBody Ride rideDetails) {
        Optional<Ride> rideOptional = rideRepository.findById(id);
        if (rideOptional.isPresent()) {
            Ride ride = rideOptional.get();
            ride.setDeparture(rideDetails.getDeparture()); // Set departure from rideDetails
            ride.setDestination(rideDetails.getDestination()); // Set destination from rideDetails
            ride.setDateTime(rideDetails.getDateTime()); // Set dateTime from rideDetails
            ride.setPricePerSeat(rideDetails.getPricePerSeat()); // Set pricePerSeat from rideDetails
            ride.setAvailableSeats(rideDetails.getAvailableSeats()); // Set availableSeats from rideDetails
            ride.setComments(rideDetails.getComments()); // Set comments from rideDetails
            rideRepository.save(ride); // Save the updated ride
            return ResponseEntity.ok(ride); // Return the updated ride as response
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if ride not found
        }
    }*/

    // Delete a ride
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRide(@PathVariable Long id) {
        if (rideRepository.existsById(id)) {
            rideRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
