package com.covoiturage.voiture.mapper;

import com.covoiturage.voiture.dto.ReservationDTO;
import com.covoiturage.voiture.entity.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    @Mapping(source = "ride.id", target = "rideId")
    @Mapping(expression = "java(reservation.getRide().getDeparture() + \" to \" + reservation.getRide().getDestination())", target = "rideDetails")
    @Mapping(source = "passenger.id", target = "passengerId")
    @Mapping(source = "passenger.name", target = "passengerName")
    ReservationDTO toDTO(Reservation reservation);

    Reservation toEntity(ReservationDTO reservationDTO);
}
