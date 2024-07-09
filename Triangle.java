import java.awt.Color;
import java.awt.Graphics;

/**
 * This class allows the User to draw Triangles
 */
public class Triangle extends Shape {
	
	/**
	 * Default Construtor
	 * Used to identify when a Triangle should be drawn
	 */
	public Triangle() {}
	
	/**
	 * Constructor
	 * @param x - int array of all x coordinates for Triangle
	 * @param y - int array of all y coordinates for Triangle
	 * @param color - Current selected color
	 * @param fill - boolean that determines if Triangle will be filled
	 */
	public Triangle(int[] x, int[] y, Color color, boolean fill) {
		super(x, y, color, fill);
	}
	
	/**
	 * Method draws Triangle from coordinates in int arrays x and y. Boolean fill determines if Triangle is solid or outline. 
	 */
	public void draw(Graphics g) {
		super.draw(g);
		if (isFill()) {
			g.fillPolygon(this.getxCoords(), this.getyCoords(), 3);
		}
		else {
			g.drawPolygon(this.getxCoords(), this.getyCoords(), 3);
		}
	}
}
