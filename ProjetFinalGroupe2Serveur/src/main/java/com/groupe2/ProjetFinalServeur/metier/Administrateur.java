package com.groupe2.ProjetFinalServeur.metier;

public class Administrateur {
	
	private int idAdmin;
	private String nomAdmin;
	private String prenomAdmin;
	private String loginAdmin;
	private String passwordAdmin;
	private String emailAdmin;
	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNomAdmin() {
		return nomAdmin;
	}
	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}
	public String getPrenomAdmin() {
		return prenomAdmin;
	}
	public void setPrenomAdmin(String prenomAdmin) {
		this.prenomAdmin = prenomAdmin;
	}
	public String getLoginAdmin() {
		return loginAdmin;
	}
	public void setLoginAdmin(String loginAdmin) {
		this.loginAdmin = loginAdmin;
	}
	public String getPasswordAdmin() {
		return passwordAdmin;
	}
	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}
	public String getEmailAdmin() {
		return emailAdmin;
	}
	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
	@Override
	public String toString() {
		return "Administrateur [idAdmin=" + idAdmin + ", nomAdmin=" + nomAdmin + ", prenomAdmin=" + prenomAdmin
				+ ", loginAdmin=" + loginAdmin + ", passwordAdmin=" + passwordAdmin + ", emailAdmin=" + emailAdmin
				+ "]";
	}
	
	

}
