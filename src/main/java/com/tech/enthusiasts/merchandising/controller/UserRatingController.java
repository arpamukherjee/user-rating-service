package com.tech.enthusiasts.merchandising.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.enthusiasts.merchandising.response.UserRatingDetails;
import com.tech.enthusiasts.merchandising.service.UserRatingService;

@RestController
@RequestMapping("/user/rating")
public class UserRatingController {
	
	@Autowired
	private UserRatingService ratingService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserRatingDetails> findBrandRatingByUserId(@PathVariable final Long userId){
		final UserRatingDetails userRatingDetails = ratingService.findBrandRatingByUserId(userId);
		return ResponseEntity.ok(userRatingDetails);
	}
}
