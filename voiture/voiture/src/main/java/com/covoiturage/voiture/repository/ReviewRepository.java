package com.covoiturage.voiture.repository;

import com.covoiturage.voiture.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    // Custom query to find reviews by reviewer ID
    List<Review> findByReviewerId(Long reviewerId);

    // Custom query to find reviews by reviewee ID
    List<Review> findByRevieweeId(Long revieweeId);

    // Custom query to find all reviews with a specific rating
    List<Review> findByRating(Integer rating);
}
