package com.domain.ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.ratingsdataservice.model.Rating;
import com.domain.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId){
/*		List<Rating> ratings = Arrays.asList(
				new Rating("12", 4),
				new Rating("11", 3)
		);*/
		UserRating userRating = new UserRating();
		userRating.initData(userId);
		return userRating;
	}
	
}
