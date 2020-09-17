package com.formation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Utilisateur;

@Repository("urepo")
public interface IUtilisateurRepository extends JpaRepository <Utilisateur, Long>{
	
	public List<Utilisateur> findByNomUtilisateur(String nomUtilisateur);

}
