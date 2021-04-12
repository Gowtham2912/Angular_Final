package com.gowtham.movie.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gowtham.movie.entity.Movie;
import com.gowtham.movie.service.MovieService;





@RestController
public class MovieController {

	 Logger logger = LoggerFactory.getLogger(MovieController.class);
	 
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies/all")
	public Iterable<Movie> getMovie(){
		 logger.info("JSON value of all movie details");
		return movieService.findAll();
	}
	
	@GetMapping("/movies")
	public List<Object> getAllMovie(){
		List<Object> movie=movieService.findName();
		return movie;
	}
	

	@GetMapping("/movies/{id}")
	public ResponseEntity<?> getMovie(@PathVariable("id") int id){
		Movie movie=movieService.find(id);
	    if(movie==null) {
	    	return new ResponseEntity<String>("No movie found for ID"+id,HttpStatus.OK);
	    }
	    return new ResponseEntity<Movie>(movie,HttpStatus.OK);
	}
	
	
	@PostMapping("/movies/shows")
	public List<Object> getAllShowMovie(){
		List<Object> movie=movieService.findMovieShows();
		return movie;
	}
	
	@PostMapping("/movies")
	Movie newMovie(@RequestBody Movie movie) {
		return movieService.save(movie);
	}
	
	
}
