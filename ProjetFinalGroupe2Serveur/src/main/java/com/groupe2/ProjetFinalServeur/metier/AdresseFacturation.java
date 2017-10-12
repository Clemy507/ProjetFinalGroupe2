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
@DiscriminatorValue("adr_facturation")
public class AdresseFacturation extends Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAdresseFacturation;
	@OneToOne(mappedBy="adrFactDeLaCommande")
	private Commande commandeAvecCetteAdrFact;

	public int getIdAdresseFacturation() {
		return idAdresseFacturation;
	}

	public void setIdAdresseFacturation(int idAdresseFacturation) {
		this.idAdresseFacturation = idAdresseFacturation;
	}
	
	public Commande getCommandeAvecCetteAdrFact() {
		return commandeAvecCetteAdrFact;
	}

	public void setCommandeAvecCetteAdrFact(Commande commandeAvecCetteAdrFact) {
		this.commandeAvecCetteAdrFact = commandeAvecCetteAdrFact;
	}

	@Override
	public String toString() {
		return "AdresseFacturation [idAdresseFacturation=" + idAdresseFacturation + ", commandeAvecCetteAdrFact="
				+ commandeAvecCetteAdrFact + "]";
	}
	

}
