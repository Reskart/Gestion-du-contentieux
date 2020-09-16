package com.formation.service;

import java.util.List;

import com.formation.entities.Tribunal;


public interface ITribunalService {
	public Tribunal saveOrUpdate(Tribunal t);
	public void delete(Long id);
	public Tribunal getById(Long id);
	public List<Tribunal> getAll();
}
