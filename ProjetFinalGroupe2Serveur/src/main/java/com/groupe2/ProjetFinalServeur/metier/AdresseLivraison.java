package com.groupe2.ProjetFinalServeur.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
@DiscriminatorValue("adr_livraison")
public class AdresseLivraison extends Adresse {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAdresseLivraison;
	@OneToOne(mappedBy="adrLivrDeLaCommande")
	private Commande commandeAvecCetteAdrLivr;
	
	public int getIdAdresseLivraison() {
		return idAdresseLivraison;
	}

	public void setIdAdresseLivraison(int idAdresseLivraison) {
		this.idAdresseLivraison = idAdresseLivraison;
	}

	public Commande getCommandeAvecCetteAdrLivr() {
		return commandeAvecCetteAdrLivr;
	}

	public void setCommandeAvecCetteAdrLivr(Commande commandeAvecCetteAdrLivr) {
		this.commandeAvecCetteAdrLivr = commandeAvecCetteAdrLivr;
	}

	@Override
	public String toString() {
		return "AdresseLivraison [idAdresseLivraison=" + idAdresseLivraison + ", commandeAvecCetteAdrLivr="
				+ commandeAvecCetteAdrLivr + "]";
	}
	
	
}
