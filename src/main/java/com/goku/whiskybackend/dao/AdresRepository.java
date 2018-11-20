package com.goku.whiskybackend.dao;

import com.goku.whiskybackend.domain.Adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresRepository extends JpaRepository<Adres, Long> {
    Iterable<Adres> getAdressesByBreweryId(Long breweryid);

    @Query(value = "SELECT a FROM Adres AS a WHERE a.country = :country")
    List<Adres> findAdresByCountry(@Param("country") String country);

    //zelf query maken om alleen current adres op te halen, join brewery met adres
    @Query("SELECT a FROM Adres AS a WHERE breweryid=:adresId AND (a.startdate <= CURRENT_DATE) AND (a.stopdate > CURRENT_DATE OR a.stopdate = NULL)")
    Adres findCurrentAdresByadresId(@Param("adresId")Long adresId);


}
