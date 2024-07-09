import java.awt.Color;
import java.awt.Graphics;

/**
 * Rectangle class draws a Rectangle
 *
 */
public class Rectangle extends Shape{
	
	/**
	 * Default Constructor
	 * Used to identify when a Rectangle should be drawn
	 */
	public Rectangle() {}
	
	/**
	 * Constructor
	 * @param x - int of initial x coordinate
	 * @param y - int of initial y coordinate
	 * @param height - int of height of rectangle
	 * @param width - int of width of rectangle
	 * @param color - Color of rectangle
	 * @param fill - boolean to determine if solid/outlined
	 */
	public Rectangle(int x, int y, int height, int width, Color color, boolean fill) {
		super(x, y, height, width, color, fill);
	}
	/**
	 * Method draws rectangle from initial coordinates, width/height, color, and fill boolean
	 */
	public void draw(Graphics g) {
		super.draw(g);
		if (isFill()) {
			g.fillRect(getX(), getY(), getWidth(), getHeight());
		}
		else {
			g.drawRect(getX(), getY(), getWidth(), getHeight());
		}
	}
}
