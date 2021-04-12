package com.gowtham.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gowtham.movie.entity.Movie;
import com.gowtham.movie.repository.MovieRepository;


@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Iterable<Movie> findAll() {
		return movieRepository.findAll();
	}

	@Override
	public Movie find(int id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public List<Movie> findByOne(String name) {
		return movieRepository.findByName(name);
	}

	@Override
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public void delete(int id) {
		movieRepository.deleteById(id);
	}

	@Override
	public List<Movie> findByLang(String language) {
		return movieRepository.findByLanguage(language);
	}

	@Override
	public List<Movie> findByGen(String genre) {
		return movieRepository.findByGenre(genre);
	}

	@Override
	public List<Object> findName() {
		return movieRepository.findName();
	}

	@Override
	public List<Object> findMovieShows() {
		return movieRepository.findShows();
	}

}
