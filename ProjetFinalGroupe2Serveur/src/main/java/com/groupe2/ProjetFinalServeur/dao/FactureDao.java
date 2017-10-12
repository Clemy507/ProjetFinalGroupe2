package com.groupe2.ProjetFinalServeur.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.groupe2.ProjetFinalServeur.metier.Facture;

public interface FactureDao  extends JpaRepository<Facture, Integer>{

}
