package com.goku.whiskybackend.web;

import com.goku.whiskybackend.dao.AdresRepository;
import com.goku.whiskybackend.domain.Adres;
import com.goku.whiskybackend.domain.Whisky;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AdresController {

    @Autowired
    AdresRepository adresRepository;

    //get al adresses
    @GetMapping("/adres")
    public List<Adres> getAllAdresses () {
        return adresRepository.findAll();
    }

    // Create a new Adres -> deprecated: mag alleen via registreren nieuwe Brewery!!
    @PostMapping("/adres")
    public Adres createAdres(@Valid @RequestBody Adres adres) {
        return adresRepository.save(adres);
    }
}
