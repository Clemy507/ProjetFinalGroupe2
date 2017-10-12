package com.groupe2.ProjetFinalServeur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupe2.ProjetFinalServeur.metier.MoyenDePaiement;

 

public interface MoyenDePaiementDao  extends JpaRepository<MoyenDePaiement, Integer>{

}
