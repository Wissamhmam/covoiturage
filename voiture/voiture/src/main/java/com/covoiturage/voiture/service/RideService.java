package com.covoiturage.voiture.service;

import com.covoiturage.voiture.entity.Ride;
import com.covoiturage.voiture.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;

    // Get all rides
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    // Get a ride by ID
    public Optional<Ride> getRideById(Long id) {
        return rideRepository.findById(id);
    }

    // Get rides by driver ID
    public List<Ride> getRidesByDriverId(Long driverId) {
        return rideRepository.findByDriverId(driverId);
    }

    // Create a new ride
    public Ride createRide(Ride ride) {
        return rideRepository.save(ride);
    }

    // Update a ride
    /**public Optional<Ride> updateRide(Long id, Ride rideDetails) {
        Optional<Ride> rideOptional = rideRepository.findById(id);
        if (rideOptional.isPresent()) {
            Ride ride = rideOptional.get();
            ride.setDeparture(rideDetails.getDeparture());
            ride.setDestination(rideDetails.getDestination());
            ride.setDateTime(rideDetails.getDateTime());
            ride.setPricePerSeat(rideDetails.getPricePerSeat());
            ride.setAvailableSeats(rideDetails.getAvailableSeats());
            ride.setComments(rideDetails.getComments());
            rideRepository.save(ride);
            return Optional.of(ride);
        }
        return Optional.empty();
    }*/

    // Delete a ride
    public boolean deleteRide(Long id) {
        if (rideRepository.existsById(id)) {
            rideRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
