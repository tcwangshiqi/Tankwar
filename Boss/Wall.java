package Boss;
import java.awt.*;

public class Wall {

	int x,y,w,h;
	TankClient tc;
	
	public Wall(int x, int y, int w, int h, TankClient tc) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.tc = tc;
	}
	
	public void draw(Graphics g) {
		//g.fillRect(x, y, w, h);
	}
	
	public Rectangle getRech() {
		return new Rectangle(x,y,w,h);
	}
}
