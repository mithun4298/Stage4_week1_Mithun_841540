package com.mithun.cognizant.MovieCruiser.service;

import java.text.ParseException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mithun.cognizant.MovieCruiser.dao.MovieDao;
import com.mithun.cognizant.MovieCruiser.model.Movie;

@Service
public class MovieService {

	@Autowired
	private MovieDao md;

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieService.class);

	public ArrayList<Movie> getAllMoviesAdmin() {
		// TODO Auto-generated method stub
		LOGGER.debug("MovieService Starts");
		return md.getAllMoviesAdmin();
	}

	public void editMovieAdmin(Movie updateMovie, int movieId) {
		// TODO Auto-generated method stub
		LOGGER.debug("START");
		md.editMovieAdmin(updateMovie, movieId);

	}

	public ArrayList<Movie> getAllMoviesCustomer() {
		// TODO Auto-generated method stub
		LOGGER.debug("START");
		return md.getAllMoviesCustomer();
	}

	public ArrayList<Movie> getActiveMoviesCustomer() throws ParseException {
		// TODO Auto-generated method stub
		LOGGER.debug("START");
		return md.getActiveMoviesCustomer();
	}

	public ArrayList<Movie> getFavoriteMoviesCustomer(String userId) {
		// TODO Auto-generated method stub
		LOGGER.debug("START");
		return md.getFavoriteMoviesCustomer(userId);
	}

	public void addFavoriteMovieCustomer(String userId, int movieId) {
		// TODO Auto-generated method stub
		LOGGER.debug("START");
		md.addFavoriteMovieCustomer(userId, movieId);
		LOGGER.debug("END");
	}

	public void removeFavoriteMovieCustomer(String userId, int movieId) {
		// TODO Auto-generated method stub
		LOGGER.debug("START");
		md.removeFavoriteMovieCustomer(userId, movieId);
		LOGGER.debug("END");
	}

}
