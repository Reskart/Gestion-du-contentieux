package com.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Role;

@Repository("rorepo")
public interface IRoleRepository extends JpaRepository <Role, Long> {

}
