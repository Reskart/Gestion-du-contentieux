package com.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})@JsonIdentityInfo(scope=Tribunal.class, generator=ObjectIdGenerators.PropertyGenerator.class, property="idTribunal")
public class Tribunal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Long idTribunal;
	private String adresse;
	private String fax;
	private String tel;
	private String region;
	private List<Tache> Taches;


	@OneToMany(mappedBy="tribunal",orphanRemoval = true,fetch = FetchType.LAZY)
	public List<Tache> getListTache() {
		return Taches;
	}

	public void setListTache(List<Tache> listTache) {
		this.Taches = listTache;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdTribunal() {
		return idTribunal;
	}

	public Tribunal(Long idTribunal, String adresse, String fax, String tel, String region, List<Tache> taches) {
		super();
		this.idTribunal = idTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
		Taches = taches;
	}

	public Tribunal() {
		super();
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}

	@Override
	public String toString() {
		return "Tribunal [idTribunal=" + idTribunal + ", adresse=" + adresse + ", fax=" + fax + ", tel=" + tel
				+ ", region=" + region + ", Taches=" + Taches + "]";
	}
	

	

	
	
	

}
