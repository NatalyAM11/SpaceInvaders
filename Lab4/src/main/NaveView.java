package main;
import processing.core.PApplet;
import java.util.ArrayList;



public class NaveView {
		
	public static int posX;
	private PApplet app;
	boolean right, left ;
	
	
	


	public NaveView (PApplet app) {
		
		this.app=app;
		
	}
	

	

	public void pintar(PApplet app) {
		
		this.posX=app.width/2;
		app.fill(255,60,30);
		app.rect(this.posX,app.height-40,40,40);
	}

	



	public int getPosX() {
		return posX;
	}




	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	
	}