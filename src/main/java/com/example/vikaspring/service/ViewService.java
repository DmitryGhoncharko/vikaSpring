package com.example.vikaspring.service;

import com.example.vikaspring.model.Movie;
import com.example.vikaspring.repository.CategoryRepository;
import com.example.vikaspring.repository.MovieRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ViewService {
    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
