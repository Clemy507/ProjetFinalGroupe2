package com.groupe2.ProjetFinalServeur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupe2.ProjetFinalServeur.metier.AdresseFacturation;


public interface AdresseFacturationDao  extends JpaRepository<AdresseFacturation, Integer> {

}
