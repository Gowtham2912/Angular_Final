package com.gowtham.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	private String language;
	private String genre;
	private int rating;
	private String review;
	private String description;
	@Column(name="date")
	private String dateOfRelease;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Movie() {
		super();
	}
	public Movie(int id, String name, String language, String genre, int rating, String review, String description,
				 String dateOfRelease) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.genre = genre;
		this.rating = rating;
		this.review = review;
		this.description = description;
		this.dateOfRelease = dateOfRelease;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}



	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}

	public String getDateOfRelease() {
		return dateOfRelease;
	}
	public void setDateOfRelease(String dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}
	

}
