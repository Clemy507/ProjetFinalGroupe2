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
@DiscriminatorValue("virement")
public class PaiementVirement extends MoyenDePaiement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idVirement;

	public int getIdVirement() {
		return idVirement;
	}

	public void setIdVirement(int idVirement) {
		this.idVirement = idVirement;
	}

	@Override
	public String toString() {
		return "PaiementVirement [idVirement=" + idVirement + "]";
	}
	
	
}
