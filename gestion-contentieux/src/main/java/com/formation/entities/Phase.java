package com.formation.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="idPhase")
public class Phase implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idPhase;
	private String nom;
	private Date dateDebut;
	private Tache tache;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idTache")
	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

	@Override
	public String toString() {
		return "Phase [idPhase=" + idPhase + ", nom=" + nom + ", dateDebut=" + dateDebut + ", tache=" + tache
				+ ", dateFin=" + dateFin + "]";
	}

	public Phase() {
		super();
	}



	public Phase(long idPhase, String nom, Date dateDebut, Tache tache, Date dateFin) {
		super();
		this.idPhase = idPhase;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.tache = tache;
		this.dateFin = dateFin;
	}



	private Date dateFin;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdPhase() {
		return idPhase;
	}

	public void setIdPhase(Long idPhase) {
		this.idPhase = idPhase;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	

}
