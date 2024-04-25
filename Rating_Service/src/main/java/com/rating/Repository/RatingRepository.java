package com.rating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.Entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
