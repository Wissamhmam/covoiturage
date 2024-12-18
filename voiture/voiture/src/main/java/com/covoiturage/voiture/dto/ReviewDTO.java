package com.covoiturage.voiture.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {

    private Long id;
    private Long reviewerId;
    private String reviewerName; // Reviewer’s name
    private Long revieweeId;
    private String revieweeName; // Reviewee’s name
    private Integer rating; // Rating between 1 and 5
    private String comment;
}
