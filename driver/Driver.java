package driver;

import bola.Bola;
import bola.Color;
import factory.ObjectFactory;

public class Driver {
	
	public static void main(String[] args) {
		/*
		 * News need to go
		Bola myBola=new Bola();
		myBola.setColor(Color.YELLOW);
		myBola.setNombre("Yellow Ball");
		
		System.out.println("Conteo de bolas = "+Bola.contador);
		
		Bola myBola2=new Bola();
		myBola.setColor(Color.GREEN);
		myBola.setNombre("Green Ball");
		
		System.out.println("Conteo de bolas = "+Bola.contador);
		*/
	
		//Create the factory	
		ObjectFactory myFactory = new ObjectFactory();
	
		//Make first ball
		Bola myBola = (Bola) myFactory.create("bola.Bola");
		myBola.setColor(Color.GREEN);
		myBola.setNombre("Green Ball");
		
		//Make second ball
		Bola myBola2 = (Bola) myFactory.create("bola.Bola");
		myBola2.setColor(Color.BLUE);
		myBola2.setNombre("Blue Ball");
		
		System.out.println("Conteo de bolas = "+Bola.contador);
		
		
		
		
	
		
		
	}
	
	
	
	
	

}
