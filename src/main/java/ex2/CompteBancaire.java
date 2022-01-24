package ex2;

/** Classa abstraite qui designe un compte bancaire
 * 
 * @author DIGINAMIC
 */
public  abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	

	/** methode abstraite pour afficher le type de compte*/
	public abstract String getType();
	
	
	/** methode abstraite pour ajouter un montant au solde*/
	public abstract double ajouterMontant(double montant);
	
	/** methode abstraite pour débiter un montant au solde*/
	public abstract boolean debiterMontant(double montant);


	
	//Constructeur
	public CompteBancaire(double solde) {
		super();
		this.solde = solde;
	}


	//Getters et Setters
	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
