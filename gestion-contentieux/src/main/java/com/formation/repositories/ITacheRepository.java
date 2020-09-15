package com.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Tache;

@Repository("trepo")
public interface ITacheRepository extends JpaRepository<Tache, Long> {

}
