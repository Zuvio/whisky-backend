package com.goku.whiskybackend.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="brewery", schema="whisky")
@JsonPropertyOrder({"id","breweryName","adres_id","whiskys"})
public class Brewery implements Serializable {

    @OneToMany(mappedBy = "brewery")
    @JsonManagedReference
    private List<Whisky> whiskys;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "brewery")
    @NotBlank
    private String breweryName;

    @Column(name = "adresid")
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

    public List<Whisky> getWhiskys() {
        return whiskys;
    }

    public void setWhiskys(List<Whisky> whiskys) {
        this.whiskys = whiskys;
    }
}
