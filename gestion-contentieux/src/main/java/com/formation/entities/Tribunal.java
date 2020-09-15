package com.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tribunal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Long idTribunal;
	private String adresse;
	private Double fax;
	private Double tel;
	private String region;
	private List<Tache> Taches;


	@OneToMany(mappedBy="Tache")
	public List<Tache> getListTache() {
		return Taches;
	}

	public void setListTache(List<Tache> listTache) {
		this.Taches = listTache;
	}

	public Tribunal() {
		super();
	}


	public Tribunal(Long idTribunal, String adresse, Double fax, Double tel, String region, List<Tache> taches) {
		super();
		this.idTribunal = idTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
		Taches = taches;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdTribunal() {
		return idTribunal;
	}
	
	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Double getFax() {
		return fax;
	}
	
	public void setFax(Double fax) {
		this.fax = fax;
	}
	
	public Double getTel() {
		return tel;
	}
	
	public void setTel(Double tel) {
		this.tel = tel;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Tribunal [idTribunal=" + idTribunal + ", adresse=" + adresse + ", fax=" + fax + ", tel=" + tel
				+ ", region=" + region + ", Taches=" + Taches + "]";
	}
	

	
	
	

}
