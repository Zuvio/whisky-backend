package com.goku.whiskybackend.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name="brewery", schema="whisky")
//@JsonPropertyOrder({"id","breweryName","adres_id"})
public class Brewery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
    private Long id;

//    @Column(name = "BREWERY")
    @NotBlank
    private String breweryName;

//    @Column(name = "ADRES_ID")
    @NotBlank
    private Long adres_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    public Long getAdres_id() {
        return adres_id;
    }

    public void setAdres_id(Long adres_id) {
        this.adres_id = adres_id;
    }
}
