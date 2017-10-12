package com.groupe2.ProjetFinalServeur.metier;

import java.util.Date;

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
public class Facture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Facture;
	private Date dateFacture;
	@OneToOne(mappedBy="factureDeLaCommande")
	private Commande commandeDeLaFacture;
	
	public int getFacture() {
		return Facture;
	}
	public void setFacture(int facture) {
		Facture = facture;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public Commande getCommandeDeLaFacture() {
		return commandeDeLaFacture;
	}
	public void setCommandeDeLaFacture(Commande commandeDeLaFacture) {
		this.commandeDeLaFacture = commandeDeLaFacture;
	}
	@Override
	public String toString() {
		return "Facture [Facture=" + Facture + ", dateFacture=" + dateFacture + ", commandeDeLaFacture="
				+ commandeDeLaFacture + "]";
	}
	
	

}
