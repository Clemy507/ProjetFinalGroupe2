package com.groupe2.ProjetFinalServeur.service;

import java.util.List;
import java.util.Optional;

import com.groupe2.ProjetFinalServeur.metier.Administrateur;
import com.groupe2.ProjetFinalServeur.metier.AdresseFacturation;
import com.groupe2.ProjetFinalServeur.metier.AdresseLivraison;
import com.groupe2.ProjetFinalServeur.metier.AvisConsommateur;
import com.groupe2.ProjetFinalServeur.metier.Categorie;
import com.groupe2.ProjetFinalServeur.metier.Client;
import com.groupe2.ProjetFinalServeur.metier.Commande;
import com.groupe2.ProjetFinalServeur.metier.Facture;
import com.groupe2.ProjetFinalServeur.metier.MoyenDePaiement;
import com.groupe2.ProjetFinalServeur.metier.Produit;

public interface IAdmin {
	
	
	//CRUD Produit
	public Produit createProduit(Produit p);
	public Produit deleteProduit(Produit p);
	public Produit updtaeProduit(Produit p);
	public List<Produit> findAllProduit();
	public Optional<Produit> getProduit (int id);
	
	
	//CRUD Client
	public Client createClient(Client c);
	public Client deleteClient(Client c);
	public Client updateClient(Client c);
	public List<Client> findAllClient();
	public Optional<Client> getClient (int id);
	
	
	//CRUD Administrateur
	public Administrateur createAdministrateur(Administrateur ad);
	public Administrateur deleteAdministrateur(Administrateur ad);
	public Administrateur updateAdministrateur(Administrateur ad);
	public List<Administrateur> findAllAdministrateur();
	public Optional<Administrateur> getAdministrateur(int id);
	
	//CRUD Categorie
	public Categorie createCategorie(Categorie ca);
	public Categorie deleteCategorie(Categorie ca);
	public Categorie updateCategorie(Categorie ca);
	public List<Categorie> findAllCategorie();
	public Optional<Categorie> getCategorie(int id);
	
	//CRUD AdresseFacturation
	public AdresseFacturation createAddFactu(AdresseFacturation af);
	public AdresseFacturation deleteAddFactu(AdresseFacturation af);
	public AdresseFacturation updateAddFactu(AdresseFacturation af);
	public List<AdresseFacturation> findAllAddFactu();
	public Optional<AdresseFacturation> getAddFactu(int id);
	
	//CRUD AdresseLivraison
	public AdresseLivraison createAddLiv(AdresseLivraison al);
	public AdresseLivraison deleteAddLiv(AdresseLivraison al);
	public AdresseLivraison updateAddLiv(AdresseLivraison al);
	public List<AdresseLivraison> findAllAddLiv();
	public Optional<AdresseLivraison> getAddLiv(int id);
	
	//CRUD Commande
	public Commande createCommande(Commande co);
	public Commande deleteCommande(Commande co);
	public Commande updateCommand(Commande co);
	public List<Commande> findAllCommande();
	public Optional<Commande> getCommande(int id);
	
	//CRUD Facture
	public Facture createFacture(Facture f);
	public Facture deleteFacture(Facture f);
	public Facture updateFacture(Facture f);
	public List<Facture> findAllFacture();
	public Optional<Facture> getFacture(int id);
	
	//CRUD MoyenDePaiement
	public MoyenDePaiement createMoyPaiement(MoyenDePaiement mdp);
	public MoyenDePaiement deleteMoyPaiement(MoyenDePaiement mdp);
	public MoyenDePaiement updateoyPaiement(MoyenDePaiement mdp);
	public List<MoyenDePaiement> findAllMoyPaiement();
	public Optional<MoyenDePaiement> getMoyPaiement(int id);
	
	//CRUD AvisConsommateur
	public AvisConsommateur createAvisConso(AvisConsommateur av);
	public AvisConsommateur deleteAvisConso(AvisConsommateur av);
	public AvisConsommateur updateAvisConso(AvisConsommateur av);
	public List<AvisConsommateur> findAllAvisConso();
	public Optional<AvisConsommateur> getAvisConso(int id);
	
	
	

}
