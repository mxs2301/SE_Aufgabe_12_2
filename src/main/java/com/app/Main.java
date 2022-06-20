package com.app;

public class Main{
	public static void main(String[] args) {
		System.out.println("Help");
		
		AnimalBreeder Max = new AnimalBreeder();

		Animal party = Max.getAnimal("Tiger");

		party.roar();


	}
}