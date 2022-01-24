package ex2;

/**Classe qui représente un compte courant qui hérite de la class CompteBancaire
 * 
 * @author Marlène
 * */

public class CompteCourant extends CompteBancaire {
	

	/** decouvert : un dÃ©couvert est autorisÃ© seulement pour les comptes courants */
	private double decouvert;

	
	/** méthode qui retourne une string pour recuperer le type de compte bancaire*/
	@Override
	public String getType() {
		return "Compte Courant";
	}

	
	/** methode qui ajoute un montant au solde*/
	@Override
	public double ajouterMontant(double montant) {
		return super.getSolde()+ montant;
	}

	
	/** methode qui débiter un montant au solde
	 * @return boolean*/
	@Override
	public boolean debiterMontant(double montant) {
		
		if(super.getSolde()-montant < decouvert) {
			return false;
		}else {
			super.setSolde(super.getSolde()-montant);
			return true;
		}
		
		
	}
	
	
	//Constrcuteur
	

	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}


	//Getters et setters
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	
	
	
	
	
	
	

}
