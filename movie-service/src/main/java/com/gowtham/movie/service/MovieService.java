package com.gowtham.movie.service;

import java.util.List;


import com.gowtham.movie.entity.Movie;

public interface MovieService {

	public Iterable<Movie> findAll();
	
	public Movie find(int id);
	
	public List<Movie> findByOne(String name);
	
	public List<Movie> findByLang(String language);
	
	public List<Movie> findByGen(String genre);
	
	public List<Object> findName();
	
	public List<Object> findMovieShows();
	
	public Movie save(Movie movie);
	
	public void delete(int id);
	
	
}
