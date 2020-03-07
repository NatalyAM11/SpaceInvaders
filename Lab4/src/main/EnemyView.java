package main;
import processing.core.PApplet;
import java.util.ArrayList;

public class EnemyView {
	
	public int x;
	public int y;
	PApplet app;
	
	
	
	public EnemyView (PApplet app, int x, int y) {
		
		this.x=x;
		this.y=y;
		this.app=app;
		
	}
	
	public void pintar() {
		
		app.fill(87,35,100);
		app.ellipse(this.x, this.y, 40, 40);
	}

	public void mover() {}
	
	
	

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


}
