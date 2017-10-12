package com.groupe2.ProjetFinalServeur.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class AvisConsommateur{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAvis;
	private String avis;
	private int note;
	
	
	public int getIdAvis() {
		return idAvis;
	}
	public void setIdAvis(int idAvis) {
		this.idAvis = idAvis;
	}
	public String getAvis() {
		return avis;
	}
	public void setAvis(String avis) {
		this.avis = avis;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "AvisConsommateur [idAvis=" + idAvis + ", avis=" + avis + ", note=" + note + "]";
	}
	
	

}
