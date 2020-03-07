package main;
import processing.core.PApplet;
import java.util.ArrayList;

import main.Bala;
import controller.NaveController;
import model.naveLogic;



public class NaveView {
		
	public int posX;
	public int posY;
	private PApplet app;
    private NaveController nc;
    
    
    //Arreglo para las balas infinitas
    ArrayList<Bala> balas;
	

    
    
    
	public NaveView (PApplet app,int posX, int posY) {
		this.posX= posX;
		this.posY= posY;
		this.app=app;
		nc= new NaveController();
		balas = new ArrayList<>();
		
	}
	

	
	//Con lo que pinto el cosito
	public void pintar() {
		app.noStroke();
		app.fill(52,248,212);
		app.rect(this.posX,this.posY,40,40);
		
		
		//for para laa balas
		for (int i = 0; i < balas.size(); i++) {
			balas.get(i).pintar();
		}
		
		}

	
	public void mover() {
		
		//Comandos para controlar las teclas
		
		//muevo de derecha a izquierda la nave
		if (app.keyCode == app.RIGHT) {
			posX+=5;
			}
		if (app.keyCode == app.LEFT) {
			posX-=5;
			}
		
		//Disparo las balas con espacio
		if (app.keyCode == ' ') {
			disparar();
			
		}
	}
	
	
	
	public void disparar() {
		Bala b = new Bala(this.posX + 20, this.posY,app);
		balas.add(b);
	}



	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}



	public PApplet getApp() {
		return app;
	}



	public void setApp(PApplet app) {
		this.app = app;
	}



	public NaveController getNc() {
		return nc;
	}



	public void setNc(NaveController nc) {
		this.nc = nc;
	}



	public ArrayList<Bala> getBalas() {
		return balas;
	}



	public void setBalas(ArrayList<Bala> balas) {
		this.balas = balas;
	}
			 
}

		
		
	







	







	
	
	
	
	