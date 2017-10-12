package com.groupe2.ProjetFinalServeur.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class Commande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCommande;
	private Date dateCommande;
	private String etatCommande;
	@OneToMany(mappedBy="commandeContenantProduits")
	private List<Produit> produitsDeLaCommande = new ArrayList<Produit>();
	@ManyToOne
	private Client clientDeLaCommande;
	@OneToOne
	private MoyenDePaiement moyenPaiementDeLaCommande;
	@OneToOne
	private Facture factureDeLaCommande;
	@OneToOne
	private AdresseFacturation adrFactDeLaCommande;
	@OneToOne
	private AdresseLivraison adrLivrDeLaCommande;
	
	
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public String getEtatCommande() {
		return etatCommande;
	}
	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}
	public List<Produit> getProduitsDeLaCommande() {
		return produitsDeLaCommande;
	}
	public void setProduitsDeLaCommande(List<Produit> produitsDeLaCommande) {
		this.produitsDeLaCommande = produitsDeLaCommande;
	}
	public Client getClientDeLaCommande() {
		return clientDeLaCommande;
	}
	public void setClientDeLaCommande(Client clientDeLaCommande) {
		this.clientDeLaCommande = clientDeLaCommande;
	}
	public MoyenDePaiement getMoyenPaiementDeLaCommande() {
		return moyenPaiementDeLaCommande;
	}
	public void setMoyenPaiementDeLaCommande(MoyenDePaiement moyenPaiementDeLaCommande) {
		this.moyenPaiementDeLaCommande = moyenPaiementDeLaCommande;
	}
	public Facture getFactureDeLaCommande() {
		return factureDeLaCommande;
	}
	public void setFactureDeLaCommande(Facture factureDeLaCommande) {
		this.factureDeLaCommande = factureDeLaCommande;
	}
	public AdresseFacturation getAdrFactDeLaCommande() {
		return adrFactDeLaCommande;
	}
	public void setAdrFactDeLaCommande(AdresseFacturation adrFactDeLaCommande) {
		this.adrFactDeLaCommande = adrFactDeLaCommande;
	}
	public AdresseLivraison getAdrLivrDeLaCommande() {
		return adrLivrDeLaCommande;
	}
	public void setAdrLivrDeLaCommande(AdresseLivraison adrLivrDeLaCommande) {
		this.adrLivrDeLaCommande = adrLivrDeLaCommande;
	}
	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", etatCommande="
				+ etatCommande + ", clientDeLaCommande=" + clientDeLaCommande + ", moyenPaiementDeLaCommande="
				+ moyenPaiementDeLaCommande + ", factureDeLaCommande=" + factureDeLaCommande + ", adrFactDeLaCommande="
				+ adrFactDeLaCommande + ", adrLivrDeLaCommande=" + adrLivrDeLaCommande + "]";
	}

	
}
