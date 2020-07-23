package com.mithun.cognizant.MovieCruiser.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mithun.cognizant.MovieCruiser.MovieCruiserApplication;
import com.mithun.cognizant.MovieCruiser.model.Movie;
import com.mithun.cognizant.MovieCruiser.service.MovieService;
//import com.mithun.cognizant.MovieCruiser.service.movieService;

@RestController
@RequestMapping("/admin/movies")
public class MovieController {

	@Autowired
	private MovieService ms;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
	
	@GetMapping
	public ArrayList<Movie> getAllMoviesAdmin() {
		LOGGER.info("MovieController STARTS");
		return ms.getAllMoviesAdmin();
	}
	
	@PutMapping("/{movieId}")
	public void editMovieAdmin(@RequestBody Movie updateMovie, @PathVariable("movieId") int movieId) {
		LOGGER.info("START");
		ms.editMovieAdmin(updateMovie, movieId);
	}
}
