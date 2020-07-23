package com.mithun.cognizant.MovieCruiser.model;

import java.util.Date;

public class Movie {
	
	private int id;
	private String title;
	private String boxOffice;
	private boolean active;
	private Date dateOfLaunch;
	private String genre;
	private boolean hasTeaser;
	private String PosterLink;

	@Override
	public String toString() {
		return "movie [id=" + id + ", title=" + title + ", boxOffice=" + boxOffice + ", isActive=" + active
				+ ", dateOfLaunch=" + dateOfLaunch + ", genre=" + genre + ", hasTeaser=" + hasTeaser + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isHasTeaser() {
		return hasTeaser;
	}

	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}
	
	public String getPosterLink() {
		return PosterLink;
	}

	public void setPosterLink(String posterLink) {
		PosterLink = posterLink;
	}
}
