package com.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Role> roles;
	
	
	private List<Tache> taches;

	private Long idUtilisateur;
	private String email;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	
	@OneToMany
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@OneToMany
	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public Utilisateur(List<Role> roles, List<Tache> taches, Long idUtilisateur, String email, String nomUtilisateur,
			String prenomUtilisateur) {
		super();
		this.roles = roles;
		this.taches = taches;
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public Utilisateur() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	
	@Override
	public String toString() {
		return "Utilisateur [roles=" + roles + ", taches=" + taches + ", idUtilisateur=" + idUtilisateur + ", email="
				+ email + ", nomUtilisateur=" + nomUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + "]";
	}
	
	
}
