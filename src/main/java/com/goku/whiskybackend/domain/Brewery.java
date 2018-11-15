package com.goku.whiskybackend.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="brewery", schema="whisky")
@JsonPropertyOrder({"id","breweryName","adres_id","whiskys","adresses"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Brewery implements Serializable {

    @OneToMany(mappedBy = "brewery") //a brewery has many whiskys -> put in a list of whiskys
    @JsonManagedReference //prevent circular reference -> this one asks
    private List<Whisky> whiskys;

//    @OneToMany
//    @JoinTable(
//            name = "adres", schema = "whisky", joinColumns = @JoinColumn(name = "breweryid"))
//    @JsonManagedReference //prevent circular reference -> this one asks
//    @WhereJoinTable(clause ="startdate <= CURRENT_DATE")
//    private List<Adres> adresses;

    @OneToMany(mappedBy = "brewery") //a brewery has many adresses -> put in a list of whiskys
    @JsonManagedReference //prevent circular reference -> this one asks
    private List<Adres> adresses;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "brewery")
    @NotNull
    private String breweryName;

//    @Column(name = "adresid")
//    @NotNull
//    private Long adres_id;

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

//    public Long getAdres_id() {
//        return adres_id;
//    }
//
//    public void setAdres_id(Long adres_id) {
//        this.adres_id = adres_id;
//    }

    public List<Whisky> getWhiskys() {
        return whiskys;
    }

    public void setWhiskys(List<Whisky> whiskys) {
        this.whiskys = whiskys;
    }

    public List<Adres> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adres> adresses) {
        this.adresses = adresses;
    }
}
