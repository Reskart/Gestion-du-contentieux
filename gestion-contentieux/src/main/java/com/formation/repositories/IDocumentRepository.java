package com.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Document;

@Repository("docrepo")
public interface IDocumentRepository extends JpaRepository<Document, Long> {

}
