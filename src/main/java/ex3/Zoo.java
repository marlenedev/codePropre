package ex3;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		this.aquarium= new Aquarium();
		this.fermeReptile = new FermeReptile();
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		}
	
	public void addAnimal(String nomAnimal, Type typeAnimal, Comportement comportement){
		
		Animal animal = new Animal(typeAnimal,nomAnimal,comportement);
		
		if (typeAnimal.equals(Type.MAMMIFERE) && comportement.equals(Comportement.CARNIVORE)){
			zoneCarnivore.addAnimal(animal);
		}
		else if (typeAnimal.equals(Type.MAMMIFERE) && comportement.equals(Comportement.HERBIVORE)){
			savaneAfricaine.addAnimal(animal);
		}
		else if (typeAnimal.equals(Type.REPTILE)){
			fermeReptile.addAnimal(animal);
		}
		else if (typeAnimal.equals(Type.POISSON)){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	
	//Getter et SEtter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}

	public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	public FermeReptile getFermeReptile() {
		return fermeReptile;
	}

	public void setFermeReptile(FermeReptile fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	public Aquarium getAquarium() {
		return aquarium;
	}

	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}


	
	
}
