package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneZoo {
	
	private List<Animal> listAnimaux;
	
	
	
	
	
	public ZoneZoo() {
		super();
		listAnimaux = new ArrayList<Animal>();
	}

	public void afficherListeAnimaux(){
		for (Animal animaux : listAnimaux) {
			System.out.println(animaux.getNom());
		}
	}
	
	public int compterAnimaux() {
		return listAnimaux.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
	
	public void addAnimal(Animal animal) {
		listAnimaux.add(animal);
	}
	
	
	

}
