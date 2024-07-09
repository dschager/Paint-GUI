import java.awt.Color;
import java.awt.Graphics;

/**
 * Class which extends Shape draws a straight, extremely thin rectangle.
 *
 */
public class Line extends Shape {
	
	/**
	 * Default Constructor
	 * Used to identify when a line should be drawn
	 */
	public Line() {	}
	
	/**
	 * Constructor
	 * @param x - int array of 4 x coordinates for line
	 * @param y - int array of 4 y coordinates for line
	 * @param color - Color of line 
	 */
	public Line(int[] x, int[] y, Color color) {
		super(x, y, color);
	}
	/**
	 * method draws line from coordinates and color
	 */
	public void draw(Graphics g) {
		super.draw(g);
		g.fillPolygon(this.getxCoords(), this.getyCoords(), 4);
		
	}

}
