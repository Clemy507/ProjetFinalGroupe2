package com.groupe2.ProjetFinalServeur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupe2.ProjetFinalServeur.metier.Administrateur;


public interface AdministrateurDao extends JpaRepository<Administrateur, Integer> {

}
