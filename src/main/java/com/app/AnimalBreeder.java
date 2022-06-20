package com.app;

public class AnimalBreeder{
	public Animal getAnimal(String Animaltyp){
		
		switch(Animaltyp){
		case "Tiger":
			return new Tiger();
		case "Cat":
			return new Cat();
		case "Panda":
			return new Panda();
		case "Red Panda":
			return new red_panda();
		default:
			return null;
		}

	}


	
	
}