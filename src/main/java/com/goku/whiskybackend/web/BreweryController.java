package com.goku.whiskybackend.web;

import com.goku.whiskybackend.dao.*;
import com.goku.whiskybackend.domain.*;
import com.goku.whiskybackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BreweryController {

    @Autowired
    BreweryRepository breweryRepository;

    //get al breweries
    @GetMapping("/breweries")
    public List<Brewery> getAllBreweries() {
        return breweryRepository.findAll();
    }

    // Get a Single Brewery
    @GetMapping("/breweries/{id}")
    public Brewery getBreweryById(@PathVariable(value = "id") Long breweryId) {
        return breweryRepository.findById(breweryId).orElseThrow(() -> new ResourceNotFoundException("Brewery", "id", breweryId));
    }

}
