package ex1;

import java.util.Date;

/** Classe qui propose des informations sur une entreprise et son affichage
 *
 *@author Marlène
 * 
 */

public class Entreprise {

	/** siret : siret de l'entreprise */
	private int siret;
	
	/** nom : nom de l'entreprise */
	private String nom;
	
	/** adresse : adresse de l'entreprise */
	private String adresse;
	
	/** dateCreation : date de creation de l'entreprise */
	private Date dateCreation;
	
	
	/** constante capital_max : capital maximum de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;
	
	
	/** Affiche les statuts de l'entreprise
	 * 
	 */
	public void AfficherStatut(){
		
	}

	
	
	
	
	// Getters et Setters
	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
	
	
	
	
	
}
