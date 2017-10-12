package com.groupe2.ProjetFinalServeur.metier;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_paiement")
@DiscriminatorValue("moyenPaiement")
public class MoyenDePaiement{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPaiement;
	@OneToOne(mappedBy="moyenPaiementDeLaCommande")
	private Commande maCommande;

	public int getIdPaiement() {
		return idPaiement;
	}

	public void setIdPaiement(int idPaiement) {
		this.idPaiement = idPaiement;
	}

	public Commande getMaCommande() {
		return maCommande;
	}

	public void setMaCommande(Commande maCommande) {
		this.maCommande = maCommande;
	}

	@Override
	public String toString() {
		return "MoyenDePaiement [idPaiement=" + idPaiement + ", maCommande=" + maCommande + "]";
	}
	
	
}
