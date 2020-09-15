package com.formation.service;

import java.util.List;

import com.formation.entities.Phase;

public interface IPhaseService {
	public Phase saveOrUpdate(Phase p);
	public void delete(Long id);
	public Phase getById(Long id);
	public List<Phase> getAll();
}
