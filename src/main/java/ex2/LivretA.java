package ex2;

public class LivretA extends CompteBancaire {
	

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	
	
	
	
	/** m�thode application de la r�muneration annuelle avce la taux*/
	
	public double appliquerRemuAnnuelle(){
		super.setSolde(getSolde()+getSolde()*tauxRemuneration/100);
		return super.getSolde();
	}

	
	/** m�thode qui retourne une string pour recuperer le type de compte bancaire*/
	@Override
	public String getType() {
		return "Livret A";
	}

	
	/** methode qui ajoute un montant au solde*/
	@Override
	public double ajouterMontant(double montant) {
		return super.getSolde()+ montant;
	}
	
	
	/** methode qui d�biter un montant au solde
	 * @return boolean*/

	@Override
	public boolean debiterMontant(double montant) {
		if(super.getSolde()-montant < 0) {
			return false;
		}else {
			super.setSolde(super.getSolde()-montant);
			return true;
		}
	}

	
	//Constructeur

	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}



	//Getter et setter
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}



	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
	
	
	

}
