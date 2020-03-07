package main;

import controller.NaveController;
import model.naveLogic;
import processing.core.PApplet;
import processing.core.PImage;
import java.util.ArrayList;

public class Main extends PApplet {
	
	public NaveView nave;
	public naveLogic log;
	public NaveController NC;
	public EnemyView enemi;
	int pantalla;
	PImage pantalla1;
	PImage bJugar;
	int posX;
	int posY;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PApplet.main("main.Main");
	}
	
	
	public void settings () {
		size(800,500);
		
	}
	
	public void setup () {
		nave= new NaveView(this,400,430);
		log= new naveLogic();
		
		pantalla=0;
		pantalla1=loadImage("img/pantallaSpace.png");
		bJugar=loadImage("img/bJugar.png");
		
	}
	
	public void draw() {
		
		//Switch que controla el contenido de cada pantalla
		switch(pantalla) {
		case 0: image(pantalla1,0,0);
		image(bJugar,300,290);
		
		break;
		case 1: 
		background(0);
		nave.pintar();
		
		
		
		
		break;
		}
		
		fill(255);
	    textSize(50);
	    text("x=" + mouseX + "y=" + mouseY, mouseX, mouseY);
	}

	
	public void mousePressed () {
		
		switch(pantalla) {
		case 0: if ((mouseX>300 && mouseX<497)&&(mouseY> 290 && mouseY <345)) {
			pantalla=1;
		}
		break;
		case 1: 
		}
		
		
	}
	
	public void keyPressed() {
	   
	nave.mover();
	}
}


	




