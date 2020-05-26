package org.sid.cinema.web;

import java.util.List;

import org.sid.cinema.dao.FilmRepository;
import org.sid.cinema.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaRestController {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@GetMapping("/listFilms")
	public List<Film> films(){
		return filmRepository.findAll();
	}
	

}
