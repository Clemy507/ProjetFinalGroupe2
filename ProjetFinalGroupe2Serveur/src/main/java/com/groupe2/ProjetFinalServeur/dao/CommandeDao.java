package com.groupe2.ProjetFinalServeur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupe2.ProjetFinalServeur.metier.Commande;

public interface CommandeDao  extends JpaRepository<Commande, Integer>{

}
