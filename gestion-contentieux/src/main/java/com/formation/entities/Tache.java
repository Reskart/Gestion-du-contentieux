package com.formation.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})@JsonIdentityInfo(scope=Tache.class, generator=ObjectIdGenerators.PropertyGenerator.class, property="idTache")
public class Tache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idTache;
	private Date dateCreation;
	private String titre;
	private String description;
	private boolean statutAudience;
	private Utilisateur user;
	private Affaire affaire;
	private Tribunal tribunal;
	private List<Phase> phases;
	
	public Tache() {
		super();
	}

	public Tache(long idTache, Date dateCreation, String titre, String description, boolean statutAudience,
			Utilisateur user, Affaire affaire, Tribunal tribunal, List<Phase> phases) {
		super();
		this.idTache = idTache;
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statutAudience = statutAudience;
		this.user = user;
		this.affaire = affaire;
		this.tribunal = tribunal;
		this.phases = phases;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatutAudience() {
		return statutAudience;
	}

	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}

	//cascade = CascadeType.ALL,
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUtilisateur")
	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idAffaire")
	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idTribunal")
	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	@OneToMany(mappedBy = "tache",orphanRemoval = true,fetch = FetchType.LAZY)
	public List<Phase> getPhases() {
		return phases;
	}

	public void setPhases(List<Phase> phases) {
		this.phases = phases;
	}

	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", dateCreation=" + dateCreation + ", titre=" + titre + ", description="
				+ description + ", statutAudience=" + statutAudience + ", user=" + user + ", affaire=" + affaire
				+ ", tribunal=" + tribunal + ", phases=" + phases + "]";
	}
	
}
