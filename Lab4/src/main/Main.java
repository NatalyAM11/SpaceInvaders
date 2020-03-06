package main;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {
	
	NaveView nave;
	Logic log;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PApplet.main("main.Main");
	}
	
	
	public void settings () {
		size(600,500);
		
	}
	
	public void setup () {
		nave= new NaveView(this);
		log= new Logic();
		
	}
	
	public void draw() {
		
		background(0);
		nave.pintar(this);
		
	}

}


