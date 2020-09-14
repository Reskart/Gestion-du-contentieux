package com.formation.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Affaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private int statut;
	
	
	public Affaire() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Affaire(Long idAffaire, String reference, String titre, String description, int statut) {
		super();
		this.idAffaire = idAffaire;
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.statut = statut;
	}
	
	
}
