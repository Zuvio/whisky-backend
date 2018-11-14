package com.goku.whiskybackend.dao;

import com.goku.whiskybackend.domain.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
}
