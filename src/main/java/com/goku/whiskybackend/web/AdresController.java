package com.goku.whiskybackend.web;

import com.goku.whiskybackend.dao.AdresRepository;
import com.goku.whiskybackend.domain.Adres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
@Validated
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

    //get adres where country is NL
    @GetMapping("/search/obv/country")
    List<Adres> findAdresByCountry(@RequestParam(required = true) @NotBlank(message = "Je moet wel een land meegeven...") String country) {
        return adresRepository.findAdresByCountry(country);
    }
}
