package com.goku.whiskybackend.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
//
@Entity
@Table(name = "whisky",schema="whisky")
@JsonPropertyOrder({"id","whiskyname","type","content","age","prize","rating","breweryid"})
public class Whisky {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotBlank
    @Column(name="whiskyname")
    private String whiskyname;

    @Column(name="type")
    private String type;

    @Column(name="content")
    private String content;

    @Column(name="age")
    private String age;

    @Column(name="prize")
    private String prize;

    @Column(name="rating")
    private String rating;

//    @Column(name="breweryid")
//    private String breweryid;

    @ManyToOne //many whiskys belong to 1 brewery -> linked on breweryid in whisky table
    @JsonBackReference //prevent json circular reference -> this one listens
    @JoinColumn(name="breweryid", nullable = false) // column breweryid in whisky links to brewery table
    private Brewery brewery;

    public Brewery getBrewery() {
        return brewery;
    }

    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhiskyname() {
        return whiskyname;
    }

    public void setWhiskyname(String whiskyname) {
        this.whiskyname = whiskyname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
