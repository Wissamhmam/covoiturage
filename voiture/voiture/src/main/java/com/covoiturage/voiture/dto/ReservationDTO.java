package com.covoiturage.voiture.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private Long id;
    private Long rideId;
    private String rideDetails; // Combines departure and destination for convenience
    private Long passengerId;
    private String passengerName; // Passenger's name
    private Integer reservedSeats;
}
