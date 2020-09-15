package com.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Utilisateur> utilisateurs;
	private Long idRole;
	private String libelle;
	
	public Role() {
		super();
	}



	public Role(List<Utilisateur> utilisateurs, Long idRole, String libelle) {
		super();
		this.utilisateurs = utilisateurs;
		this.idRole = idRole;
		this.libelle = libelle;
	}


	@OneToMany
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}



	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdRole() {
		return idRole;
	}


	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Role [utilisateurs=" + utilisateurs + ", idRole=" + idRole + ", libelle=" + libelle + "]";
	}

	
	

}
