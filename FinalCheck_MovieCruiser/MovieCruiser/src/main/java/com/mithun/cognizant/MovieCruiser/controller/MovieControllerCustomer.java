package com.mithun.cognizant.MovieCruiser.controller;

import java.text.ParseException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mithun.cognizant.MovieCruiser.model.Movie;
import com.mithun.cognizant.MovieCruiser.service.MovieService;
@RestController
@RequestMapping("/movies")
public class MovieControllerCustomer {

	@Autowired
	private MovieService movieservice;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieControllerCustomer.class);

	@GetMapping
	public ArrayList<Movie> getAllMoviesCustomer() {
		LOGGER.info("START");
		return movieservice.getAllMoviesCustomer();
	}
	
	@GetMapping("/active")
	public ArrayList<Movie> getActiveMoviesCustomer() throws ParseException {
		LOGGER.info("START");
		return movieservice.getActiveMoviesCustomer();
	}
	
	@GetMapping("/{userId}/favorite")
	public ArrayList<Movie> getFavoriteMoviesCustomer(@PathVariable("userId") String userId){
		LOGGER.info("START");
		return movieservice.getFavoriteMoviesCustomer(userId);
	}
	
	@PutMapping("/{userId}/{movieId}")
	public void addFavoriteMovieCustomer(@PathVariable("userId") String userId, @PathVariable("movieId") int movieId) {
		LOGGER.info("START");
		movieservice.addFavoriteMovieCustomer(userId, movieId);
		LOGGER.info("END");
	}
	
	@DeleteMapping("/{userId}/{movieId}")
	public void removeFavoriteMovieCustomer(@PathVariable("userId") String userId, @PathVariable("movieId") int movieId) {
		LOGGER.info("START");
		movieservice.removeFavoriteMovieCustomer(userId, movieId);
		LOGGER.info("END");
	}
}
