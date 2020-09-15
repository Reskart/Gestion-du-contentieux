package com.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Utilisateur;

@Repository("urepo")
public interface IUtilisateurRepository extends JpaRepository <Utilisateur, Long>{

}
