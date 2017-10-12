package com.groupe2.ProjetFinalServeur.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class Categorie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCat;
	private String nomCat;
	@OneToMany(mappedBy="categorieDuProduit")
	private List<Produit> produitsMemeCategorie = new ArrayList<Produit>();
	
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public List<Produit> getProduitsMemeCategorie() {
		return produitsMemeCategorie;
	}
	public void setProduitsMemeCategorie(List<Produit> produitsMemeCategorie) {
		this.produitsMemeCategorie = produitsMemeCategorie;
	}
	@Override
	public String toString() {
		return "Categorie [idCat=" + idCat + ", nomCat=" + nomCat + "]";
	}

	
}
