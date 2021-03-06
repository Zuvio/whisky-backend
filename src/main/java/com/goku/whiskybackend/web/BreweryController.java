package com.goku.whiskybackend.web;

import com.goku.whiskybackend.dao.*;
import com.goku.whiskybackend.domain.*;
import com.goku.whiskybackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BreweryController {

    @Autowired
    BreweryRepository breweryRepository;

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    AdresRepository adresRepository;

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

    //create whisky with brewery link          //POST: 	{"whiskyname":"Lekkerrr","brewery": {"id":1}}
    @PostMapping("/breweries/{id}/whisky")
    public void createWhiskywithBreweryId(@PathVariable(value = "id") Long  whiskyId, @RequestBody Whisky whisky) {
        whiskyRepository.save(whisky);
    }
//    ResponseEntity<?> save(@Valid @PathVariable(value = "id") Long  whiskyId, @RequestBody Whisky whisky) {
//        if (whisky.getId() == 0 && whisky.getWhiskyname() != null)
//            return new ResponseEntity<>(whiskyRepository.save(whisky), HttpStatus.OK);
//        else return new ResponseEntity<>("can not save", HttpStatus.BAD_REQUEST); }

    // Register a new Brewery
    @PostMapping("/breweries")
    public Brewery createBrewery(@Valid @RequestBody Brewery brewery) {
        return breweryRepository.save(brewery);
    }

    //create adres with brewery link          //POST: 	{"whiskyname":"Lekkerrr","brewery": {"id":1}}
    @PostMapping("/breweries/{id}/adres")
    public void createAdreswithBreweryId(@PathVariable(value = "id") Long  adresId, @RequestBody Adres adres) {
        adresRepository.save(adres); }

    // Get one adres
    @GetMapping("/breweries/{id}/adres")
    public Adres getAdresById(@PathVariable(value = "id") Long adresId) {
        return adresRepository.findById(adresId)
                .orElseThrow(() -> new ResourceNotFoundException("Adres", "id", adresId)); }

    // Get all adresses
    @GetMapping("/breweries/{id}/addresses")
    public Iterable<Adres> getAdressesByBreweryId(@PathVariable(value = "id") Long breweryid) {
        return adresRepository.getAdressesByBreweryId(breweryid);  }

    // Get current adres
    @GetMapping("/breweries/{id}/currentadres")
    public Adres getCurrentAdresByadresId(@PathVariable(value = "id") Long adresId) {
        return adresRepository.findCurrentAdresByadresId(adresId);  }
}
