package com.formation.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Affaire;

@Repository("arepo")
public interface IAffaireRepository extends JpaRepository<Affaire, Long> {
	
	public Affaire findByReference(String ref);
	public Affaire findByStatut(int statut);

}
