import java.awt.Color;
import java.awt.Graphics;

/**
 * Class allows user to draw a Square
 *
 */
public class Square extends Shape {
	
	/**
	 * Default Constructor
	 * Used to identify when a Square should be drawn
	 */
	public Square() {}
	
	/**
	 * Constructor
	 * @param x - int of initial x coordinate
	 * @param y - int of initial y coordinate
	 * @param side - int for side length
	 * @param color - Color that determines the color of Square
	 * @param fill - boolean that determines if Square is solid or outline
	 */
	public Square(int x, int y, int side, Color color, boolean fill) {
		super(x, y, side, color, fill);
	}
	
	/**
	 * Draws Square on canvas, using initial x and y, and side. Variables color and fill determine Square color, and solid/outline. 
	 */
	public void draw(Graphics g) {
		super.draw(g);
		if (isFill()) {
			g.fillRect(getX(), getY(), getWidth(), getWidth());
		}
		else {
			g.drawRect(getX(), getY(), getWidth(), getWidth());
		}
	}

}
