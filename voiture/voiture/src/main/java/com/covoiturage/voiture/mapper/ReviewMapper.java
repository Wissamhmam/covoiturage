package com.covoiturage.voiture.mapper;

import com.covoiturage.voiture.dto.ReviewDTO;
import com.covoiturage.voiture.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    @Mapping(source = "reviewer.id", target = "reviewerId")
    @Mapping(source = "reviewer.name", target = "reviewerName")
    @Mapping(source = "reviewee.id", target = "revieweeId")
    @Mapping(source = "reviewee.name", target = "revieweeName")
    ReviewDTO toDTO(Review review);

    Review toEntity(ReviewDTO reviewDTO);
}
