package com.goku.whiskybackend.web;

import com.goku.whiskybackend.dao.*;
import com.goku.whiskybackend.domain.*;
import com.goku.whiskybackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    //get al whiskys
    @GetMapping("/whiskys")
    public List<Whisky> getAllWhiskys () {
        return whiskyRepository.findAll();
    }

    // Get a Single whisky
    @GetMapping("/whiskys/{id}")
    public Whisky getWhiskyById(@PathVariable(value = "id") Long whiskyId) {
        return whiskyRepository.findById(whiskyId).orElseThrow(() -> new ResourceNotFoundException("Whisky", "id", whiskyId));
    }

    // Create a new Whisky -> deprecated want je kunt nu alleen een whisky aanmaken via brewery
    @PostMapping("/whiskys")
    public Whisky createWhisky(@Valid @RequestBody Whisky whisky) {
        return whiskyRepository.save(whisky);
    }



}
