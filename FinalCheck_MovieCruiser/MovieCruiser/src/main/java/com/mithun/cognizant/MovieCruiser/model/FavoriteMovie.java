package com.mithun.cognizant.MovieCruiser.model;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FavoriteMovie {

	private int id;
	private ArrayList<Integer> favoriteMovies;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FavoriteMovie.class);
	
	public FavoriteMovie() {
		LOGGER.debug(" constructor START");
		favoriteMovies = null;
		LOGGER.debug(" constructor END");
	}

	@Override
	public String toString() {
		return "favorite [id=" + id + ", favoriteMovies=" + favoriteMovies + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Integer> getFavoriteMovies() {
		return favoriteMovies;
	}

	public void setFavoriteMovies(ArrayList<Integer> favoriteMovies) {
		this.favoriteMovies = favoriteMovies;
	}
	
}
