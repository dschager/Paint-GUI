import java.awt.Color;
import java.awt.Graphics;

/**
 * Class extends Shape and allows USer to draw circles
 *
 */
public class Circle extends Shape {
	
	/**
	 *  Default Constructor
	 *  Used to identify when a circle should be drawn
	 */
	public Circle() { }
	
	/**
	 * Constructor
	 * @param x - int for initial x coordinate
	 * @param y - int for initial y coordinate
	 * @param height - int for height of circle
	 * @param width - int for width of circle
	 * @param color - Color for shape
	 * @param fill - boolean to determine if shape is solid/outlined
	 */
	public Circle(int x, int y, int height, int width, Color color, boolean fill) {
		super(x, y, height, width, color, fill);
	}
	/**
	 * Method draws circle from initial coordinates and height/width using color and fill. 
	 */
	public void draw(Graphics g) {
		super.draw(g);
		if (isFill()) {
			g.fillOval(getX(), getY(), getWidth(), getHeight());
		}
		else {
			g.drawOval(getX(), getY(), getWidth(), getHeight());
		}
	}
}
