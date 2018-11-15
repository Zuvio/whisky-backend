package com.goku.whiskybackend.web;

import com.goku.whiskybackend.dao.AdresRepository;
import com.goku.whiskybackend.domain.Adres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AdresController {

    @Autowired
    AdresRepository adresRepository;

    // Create a new Adres -> deprecated: mag alleen via registreren nieuwe Brewery!!
    @PostMapping("/adres")
    public Adres createAdres(@Valid @RequestBody Adres adres) {
        return adresRepository.save(adres);
    }
}
