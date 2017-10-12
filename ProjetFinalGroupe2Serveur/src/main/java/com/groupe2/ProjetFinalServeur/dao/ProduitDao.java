package com.groupe2.ProjetFinalServeur.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupe2.ProjetFinalServeur.metier.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Integer>{

}
