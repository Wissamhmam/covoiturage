package com.covoiturage.voiture.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDTO {

    private Long id;
    private String driverName; // Driver's name
    private Long driverId; // Driver's ID
    private String departure;
    private String destination;
    private LocalDateTime dateTime;
    private BigDecimal pricePerSeat;
    private Integer availableSeats;
    private String comments;
}
