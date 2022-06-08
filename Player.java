package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	
	public boolean right,left;
	
	public double x,y;
	
	public int width,height;
	
	public Player(double x, int y) {
		this.x = x;
		this.y = y;
		this.width = 30;
		this.height = 5;
	}
	
	public void tick(){
		if(right)
		{
			x = x+2.3;
		}
		else if(left) {
			x = x-2.3;
		}
		
		if(x+width > Game.WIDTH)
		{
			x = Game.WIDTH - width;
		}
		
		else if(x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g){
		g.setColor(Color.blue);
		g.fillRect((int)x,(int)y,width,height);
	}
	
}
