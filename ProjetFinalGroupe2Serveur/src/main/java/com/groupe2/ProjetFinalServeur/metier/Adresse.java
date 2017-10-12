package com.groupe2.ProjetFinalServeur.metier;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_adresse")
@DiscriminatorValue("adresse")
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAdresse;
	private String numero;
	private String rue;
	private String codePostal;
	private String ville;
	
	
	public int getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numero=" + numero + ", rue=" + rue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}

}
