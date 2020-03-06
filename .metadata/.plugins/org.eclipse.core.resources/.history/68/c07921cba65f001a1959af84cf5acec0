package controller;
import processing.core.PApplet;

import java.util.ArrayList;

import main.NaveView;

public class NaveController {
	
	PApplet app;
    int dir;
    boolean right, left ;
    
    
	public void keyPressed(PApplet app) {
		
		if (app.keyCode == app.LEFT) {
      	mover(-1);
		}
		if (app.keyCode == app.RIGHT) {
		mover(1);
		}
		if (app.keyCode== app.ENTER) {
			//disparar();
		}
		

	}
	
	public void mover(int dir) {
		NaveView.posX+=dir*5;
	}
	

}