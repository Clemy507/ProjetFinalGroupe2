package com.groupe2.ProjetFinalServeur.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
@DiscriminatorValue("carte")
public class PaiementCarte extends MoyenDePaiement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCarte;

	public int getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	@Override
	public String toString() {
		return "PaiementCarte [idCarte=" + idCarte + "]";
	}
	
	

}
