package com.covoiturage.voiture.mapper;

import com.covoiturage.voiture.dto.RideDTO;
import com.covoiturage.voiture.entity.Ride;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RideMapper {
    @Mapping(source = "driver.name", target = "driverName")
    @Mapping(source = "driver.id", target = "driverId")
    RideDTO toDTO(Ride ride);

    Ride toEntity(RideDTO rideDTO);
}
