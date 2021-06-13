package com.rating.data.service.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.data.service.model.Rating;
import com.rating.data.service.model.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingDataResource {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 1);
	}

	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		List<Rating> ratings = Arrays.asList(new Rating("100", 4), new Rating("103", 5));
		userRating.setRatings(ratings);
		return userRating;
	}

}
