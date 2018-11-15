package com.goku.whiskybackend.dao;

import com.goku.whiskybackend.domain.Adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresRepository extends JpaRepository<Adres, Long> {
}
