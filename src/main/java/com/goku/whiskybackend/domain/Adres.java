package com.goku.whiskybackend.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="adres", schema = "whisky")
@JsonPropertyOrder({"id","street","number","postalcode","country"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Adres implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotNull
    @Column(name="street")
    private String street;

    @Column(name="number")
    private String number;

    @Column(name="postalcode")
    private String postalcode;

    @Column(name="country")
    private String country;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="breweryid", nullable = false)
    private Brewery brewery;

    @NotNull
    @Column(name="startdate")
    private LocalDate startdate;

    @Column(name="stopdate")
    private LocalDate stopdate;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Brewery getBrewery() {
        return brewery;
    }

    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getStopdate() {
        return stopdate;
    }

    public void setStopdate(LocalDate stopdate) {
        this.stopdate = stopdate;
    }
}
