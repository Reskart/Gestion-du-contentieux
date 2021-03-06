package com.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(scope=Role.class, generator=ObjectIdGenerators.PropertyGenerator.class, property="idRole")
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


	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable( name = "T_Utilisateur_Roles_Associations",
	joinColumns = @JoinColumn( name = "idRole" ),
    inverseJoinColumns = @JoinColumn( name = "idUtilisateur" ) )
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
