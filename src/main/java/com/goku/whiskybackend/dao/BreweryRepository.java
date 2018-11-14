package com.goku.whiskybackend.dao;

import com.goku.whiskybackend.domain.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreweryRepository extends JpaRepository<Brewery, Long> {
}
