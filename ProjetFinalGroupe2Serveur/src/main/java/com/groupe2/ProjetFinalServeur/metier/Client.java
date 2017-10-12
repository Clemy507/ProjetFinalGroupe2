package com.groupe2.ProjetFinalServeur.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idClient;
	private String nomClient;
	private String prenomClient;
	private String telClient;
	private String loginClient;
	private String passwordClient;
	private String emailClient;
	@OneToMany(mappedBy="clientDeLaCommande")
	private List<Commande> commandesDuClient = new ArrayList<Commande>();
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getTelClient() {
		return telClient;
	}
	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}
	public String getLoginClient() {
		return loginClient;
	}
	public void setLoginClient(String loginClient) {
		this.loginClient = loginClient;
	}
	public String getPasswordClient() {
		return passwordClient;
	}
	public void setPasswordClient(String passwordClient) {
		this.passwordClient = passwordClient;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	public List<Commande> getCommandesDuClient() {
		return commandesDuClient;
	}
	public void setCommandesDuClient(List<Commande> commandesDuClient) {
		this.commandesDuClient = commandesDuClient;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", telClient=" + telClient + ", loginClient=" + loginClient + ", passwordClient=" + passwordClient
				+ ", emailClient=" + emailClient + "]";
	}
	
	

}
