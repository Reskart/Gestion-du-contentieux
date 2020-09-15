package com.formation.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phase {
	
	private long idPhase;
	
	private String nom;
	
	private Date dateDebut;
	
	@Override
	public String toString() {
		return "Phase [idPhase=" + idPhase + ", nom=" + nom + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}

	public Phase() {
		super();
	}

	public Phase(long idPhase, String nom, Date dateDebut, Date dateFin) {
		super();
		this.idPhase = idPhase;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	private Date dateFin;

	@Id
	public long getIdPhase() {
		return idPhase;
	}

	public void setIdPhase(long idPhase) {
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
