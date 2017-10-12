package com.groupe2.ProjetFinalServeur.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idProduit;
	private String nomProduit;
	private double prixProduit;
	private int stockProduit;
	private String description;
	@ManyToOne
	private Categorie categorieDuProduit;
	@ManyToOne
	private Commande commandeContenantProduits;
	
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}
	public int getStockProduit() {
		return stockProduit;
	}
	public void setStockProduit(int stockProduit) {
		this.stockProduit = stockProduit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Categorie getCategorieDuProduit() {
		return categorieDuProduit;
	}
	public void setCategorieDuProduit(Categorie categorieDuProduit) {
		this.categorieDuProduit = categorieDuProduit;
	}
	public Commande getCommandeContenantProduits() {
		return commandeContenantProduits;
	}
	public void setCommandeContenantProduits(Commande commandeContenantProduits) {
		this.commandeContenantProduits = commandeContenantProduits;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
				+ ", stockProduit=" + stockProduit + ", description=" + description + ", categorieDuProduit="
				+ categorieDuProduit + ", commandeContenantProduits=" + commandeContenantProduits + "]";
	}
	
	
}
