package ex3;



public class Animal {
	
	
	private Type type;
	private String nom;
	private Comportement comportement;
	
	
	
	//Constructeur
	
	public Animal(Type type, String nom, Comportement comportement) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}
	

	//Getter et Setter

	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public Comportement getComportement() {
		return comportement;
	}



	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
	
	
	
	
	



	
	

}



	
