package com.formation.entities;

import java.io.Serializable;

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
				+ ", region=" + region + "]";
	}
	
	

}
