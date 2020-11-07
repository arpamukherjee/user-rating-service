package com.tech.enthusiasts.merchandising.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tech.enthusiasts.merchandising.response.UserRatingDetails;
import com.tech.enthusiasts.merchandising.response.UserRatingDetails.UserBrandRating;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserRatingService {
	
	@Value("${server.port}")
	private int serverPort;
	
	public UserRatingDetails findBrandRatingByUserId(final Long userId) {
		log.info("Request is served from port :: {}", serverPort);
		final UserRatingDetails userRatingDetails = new UserRatingDetails();
		final List<UserBrandRating> userBrandRating = Arrays.asList(userRatingDetails.new UserBrandRating(1L, 5L),
				userRatingDetails.new UserBrandRating(2L, 5L), userRatingDetails.new UserBrandRating(3L, 5L),
				userRatingDetails.new UserBrandRating(4L, 5L));
		userRatingDetails.setUserId(userId);
		userRatingDetails.setUserBrandRating(userBrandRating);
		return userRatingDetails;

	}

}
