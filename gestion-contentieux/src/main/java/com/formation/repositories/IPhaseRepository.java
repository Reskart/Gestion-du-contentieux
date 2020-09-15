package com.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Phase;

@Repository("prepo")
public interface IPhaseRepository extends JpaRepository<Phase, Long>{

}
