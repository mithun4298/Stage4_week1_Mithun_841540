package com.mithun.cognizant.MovieCruiser.dao;

import java.text.ParseException;
import java.util.ArrayList;

import com.mithun.cognizant.MovieCruiser.model.Movie;

public interface MovieDao {

	ArrayList<Movie> getAllMoviesAdmin();

	void editMovieAdmin(Movie updateMovie, int movieId);

	ArrayList<Movie> getAllMoviesCustomer();

	ArrayList<Movie> getActiveMoviesCustomer() throws ParseException;

	ArrayList<Movie> getFavoriteMoviesCustomer(String userId);

	void addFavoriteMovieCustomer(String userId, int movieId);

	void removeFavoriteMovieCustomer(String userId, int movieId);

}
