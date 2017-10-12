package com.groupe2.ProjetFinalServeur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupe2.ProjetFinalServeur.metier.Categorie;

public interface CategorieDao  extends JpaRepository<Categorie, Integer>{

}
