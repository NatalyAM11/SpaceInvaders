package main;
import processing.core.PApplet;



public class Bala {
	PApplet app;
	int x;
	int y;
	int vel;
	
	
	public Bala(int x, int y, PApplet app) {
		this.x = x;
		this.y = y;
		this.vel = 4;
		this.app = app;
	}
	
	
	//Metodo para pintar las balitas
	public void pintar() {
		disparar();
	}
	
	
	public PApplet getApp() {
		return app;
	}


	public void setApp(PApplet app) {
		this.app = app;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getVel() {
		return vel;
	}


	public void setVel(int vel) {
		this.vel = vel;
	}


	//metodo para disparar las bolitas
	public void disparar () {
		app.fill(203,52,248);
		app.ellipse(this.x, this.y,15,15);
		this.y -= this.vel;
	}
}
	
	