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
@DiscriminatorValue("cheque")
public class PaiementCheque extends MoyenDePaiement {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCheque;

	public int getIdCheque() {
		return idCheque;
	}

	public void setIdCheque(int idCheque) {
		this.idCheque = idCheque;
	}
	
	
}
