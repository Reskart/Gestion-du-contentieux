package com.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Tribunal;

@Repository("trirepo")
public interface ITribunalRepository extends JpaRepository<Tribunal, Long>{

}
