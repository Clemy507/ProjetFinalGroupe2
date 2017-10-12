package com.groupe2.ProjetFinalServeur.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupe2.ProjetFinalServeur.dao.AdministrateurDao;
import com.groupe2.ProjetFinalServeur.dao.AdresseFacturationDao;
import com.groupe2.ProjetFinalServeur.dao.AdresseLivraisonDao;
import com.groupe2.ProjetFinalServeur.dao.AvisConsommateurDao;
import com.groupe2.ProjetFinalServeur.dao.CategorieDao;
import com.groupe2.ProjetFinalServeur.dao.ClientDao;
import com.groupe2.ProjetFinalServeur.dao.CommandeDao;
import com.groupe2.ProjetFinalServeur.dao.FactureDao;
import com.groupe2.ProjetFinalServeur.dao.MoyenDePaiementDao;
import com.groupe2.ProjetFinalServeur.dao.ProduitDao;
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

@Service
public class ServiceImpl implements IAdmin, IClient{

	@Autowired
	ProduitDao produitDao;
	
	@Autowired
	ClientDao clientDao;
	
	@Autowired
	AdministrateurDao adminDao;
	
	@Autowired
	AdresseFacturationDao addFactuDao;
	
	@Autowired
	AdresseLivraisonDao addLivDao;
	
	@Autowired
	CategorieDao categorieDao;
	
	@Autowired
	AvisConsommateurDao avisConsoDao;
	
	@Autowired
	CommandeDao commandeDao;
	
	@Autowired
	FactureDao factureDao;
	
	@Autowired
	MoyenDePaiementDao moyPaiementDao;
	
	

	
	//Crud Produit
	
	@Override
	public Produit createProduit(Produit p) {
		// TODO Auto-generated method stub
		produitDao.save(p);
		return p;
	}

	@Override
	public Produit deleteProduit(Produit p) {
		// TODO Auto-generated method stub
		produitDao.delete(p);
		return p;
	}

	@Override
	public Produit updtaeProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitDao.saveAndFlush(p);
	}

	@Override
	public List<Produit> findAllProduit() {
		// TODO Auto-generated method stub
		return produitDao.findAll();
	}

	@Override
	public Optional<Produit> getProduit(int id) {
		// TODO Auto-generated method stub
		return produitDao.findById(id);
	}

	
	//Crud Client
	@Override
	public Client createClient(Client c) {
		// TODO Auto-generated method stub
		clientDao.save(c);
		return c ;
	}

	@Override
	public Client deleteClient(Client c) {
		// TODO Auto-generated method stub
		clientDao.delete(c);
		return c;
	}

	@Override
	public Client updateClient(Client c) {
		// TODO Auto-generated method stub
		return clientDao.saveAndFlush(c);
	}

	@Override
	public List<Client> findAllClient() {
		// TODO Auto-generated method stub
		return clientDao.findAll();
	}

	@Override
	public Optional<Client> getClient(int id) {
		// TODO Auto-generated method stub
		return clientDao.findById(id);
	}

	@Override
	public Administrateur createAdministrateur(Administrateur ad) {
		// TODO Auto-generated method stub
		adminDao.save(ad);
		return ad;
	}

	@Override
	public Administrateur deleteAdministrateur(Administrateur ad) {
		// TODO Auto-generated method stub
		adminDao.delete(ad);
		return ad;
	}

	@Override
	public Administrateur updateAdministrateur(Administrateur ad) {
		// TODO Auto-generated method stub
		return adminDao.saveAndFlush(ad);
	}

	@Override
	public List<Administrateur> findAllAdministrateur() {
		// TODO Auto-generated method stub
		return adminDao.findAll();
	}

	@Override
	public Optional<Administrateur> getAdministrateur(int id) {
		// TODO Auto-generated method stub
		return adminDao.findById(id);
	}

	@Override
	public Categorie createCategorie(Categorie ca) {
		// TODO Auto-generated method stub
		categorieDao.save(ca);
		return ca;
	}

	@Override
	public Categorie deleteCategorie(Categorie ca) {
		// TODO Auto-generated method stub
		categorieDao.save(ca);
		return null;
	}

	@Override
	public Categorie updateCategorie(Categorie ca) {
		// TODO Auto-generated method stub
		return categorieDao.saveAndFlush(ca);
	}

	@Override
	public List<Categorie> findAllCategorie() {
		// TODO Auto-generated method stub
		return categorieDao.findAll();
	}

	@Override
	public Optional<Categorie> getCategorie(int id) {
		// TODO Auto-generated method stub
		return categorieDao.findById(id);
	}

	@Override
	public AdresseFacturation createAddFactu(AdresseFacturation af) {
		// TODO Auto-generated method stub
		addFactuDao.save(af);
		return af;
	}

	@Override
	public AdresseFacturation deleteAddFactu(AdresseFacturation af) {
		// TODO Auto-generated method stub
		addFactuDao.delete(af);
		return af;
	}

	@Override
	public AdresseFacturation updateAddFactu(AdresseFacturation af) {
		// TODO Auto-generated method stub
		return addFactuDao.saveAndFlush(af);
	}

	@Override
	public List<AdresseFacturation> findAllAddFactu() {
		// TODO Auto-generated method stub
		return addFactuDao.findAll();
	}

	@Override
	public Optional<AdresseFacturation> getAddFactu(int id) {
		// TODO Auto-generated method stub
		return addFactuDao.findById(id);
	}

	@Override
	public AdresseLivraison createAddLiv(AdresseLivraison al) {
		// TODO Auto-generated method stub
		addLivDao.save(al);
		return al;
	}

	@Override
	public AdresseLivraison deleteAddLiv(AdresseLivraison al) {
		// TODO Auto-generated method stub
		addLivDao.delete(al);
		return al;
	}

	@Override
	public AdresseLivraison updateAddLiv(AdresseLivraison al) {
		// TODO Auto-generated method stub
		return addLivDao.saveAndFlush(al);
	}

	@Override
	public List<AdresseLivraison> findAllAddLiv() {
		// TODO Auto-generated method stub
		return addLivDao.findAll();
	}

	@Override
	public Optional<AdresseLivraison> getAddLiv(int id) {
		// TODO Auto-generated method stub
		return addLivDao.findById(id);
	}

	@Override
	public Commande createCommande(Commande co) {
		// TODO Auto-generated method stub
		commandeDao.save(co);
		return co;
	}

	@Override
	public Commande deleteCommande(Commande co) {
		// TODO Auto-generated method stub
		commandeDao.save(co);
		return co;
	}

	@Override
	public Commande updateCommand(Commande co) {
		// TODO Auto-generated method stub
		
		return commandeDao.saveAndFlush(co);
	}

	@Override
	public List<Commande> findAllCommande() {
		// TODO Auto-generated method stub
		return commandeDao.findAll();
	}

	@Override
	public Optional<Commande> getCommande(int id) {
		// TODO Auto-generated method stub
		return commandeDao.findById(id);
	}

	@Override
	public Facture createFacture(Facture f) {
		// TODO Auto-generated method stub
		factureDao.save(f);
		return f;
	}

	@Override
	public Facture deleteFacture(Facture f) {
		// TODO Auto-generated method stub
		factureDao.delete(f);
		return f;
	}

	@Override
	public Facture updateFacture(Facture f) {
		// TODO Auto-generated method stub
		
		return factureDao.saveAndFlush(f);
	}

	@Override
	public List<Facture> findAllFacture() {
		// TODO Auto-generated method stub
		return factureDao.findAll();
	}

	@Override
	public Optional<Facture> getFacture(int id) {
		// TODO Auto-generated method stub
		return factureDao.findById(id);
	}

	@Override
	public MoyenDePaiement createMoyPaiement(MoyenDePaiement mdp) {
		// TODO Auto-generated method stub
		moyPaiementDao.save(mdp);
		return mdp;
	}

	@Override
	public MoyenDePaiement deleteMoyPaiement(MoyenDePaiement mdp) {
		// TODO Auto-generated method stub
		moyPaiementDao.delete(mdp);
		return mdp;
	}

	@Override
	public MoyenDePaiement updateoyPaiement(MoyenDePaiement mdp) {
		// TODO Auto-generated method stub
		return moyPaiementDao.saveAndFlush(mdp);
	}

	@Override
	public List<MoyenDePaiement> findAllMoyPaiement() {
		// TODO Auto-generated method stub
		return moyPaiementDao.findAll();
	}

	@Override
	public Optional<MoyenDePaiement> getMoyPaiement(int id) {
		// TODO Auto-generated method stub
		return moyPaiementDao.findById(id);
	}

	@Override
	public AvisConsommateur createAvisConso(AvisConsommateur av) {
		// TODO Auto-generated method stub
		avisConsoDao.save(av);
		return av;
	}

	@Override
	public AvisConsommateur deleteAvisConso(AvisConsommateur av) {
		// TODO Auto-generated method stub
		avisConsoDao.delete(av);
		return av;
		
	}

	@Override
	public AvisConsommateur updateAvisConso(AvisConsommateur av) {
		// TODO Auto-generated method stub
		
		return avisConsoDao.saveAndFlush(av);
	}

	@Override
	public List<AvisConsommateur> findAllAvisConso() {
		// TODO Auto-generated method stub
		return avisConsoDao.findAll();
	}

	@Override
	public Optional<AvisConsommateur> getAvisConso(int id) {
		// TODO Auto-generated method stub
		return avisConsoDao.findById(id);
	}
	
	
	

}
