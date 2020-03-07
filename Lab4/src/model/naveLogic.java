package model;


import controller.NaveController;
import main.NaveView;
import processing.core.PApplet;

public class naveLogic {
	PApplet app;
	public int posX;
	public int posY;


public void pintar() {
		
		app.fill(255,60,30);
		app.rect(this.posX,this.posY,40,40);
		}

	
	public void mover() {
		
		
		if (app.keyCode == app.RIGHT) {
			posX+=5;
			}
		if (app.keyCode == app.LEFT) {
			posX-=5;
			}
	}
			 
		

	
	
	
}

