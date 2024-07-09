import java.awt.Color;
import java.awt.Graphics;

/**
 * Abstract class with implementation for shapes. Tracks initial/all coordinates, width and height, color, and fill.
 *
 */

public abstract class Shape {
	private int x;
	private int[] xCoords;
	private int y;
	private int[] yCoords;
	private int height;
	private int width;
	protected Color color;
	protected boolean fill;
	
	
	/**
	 * Default Constructor
	 */
	public Shape() { }
	
	/**
	 * Constructor used by Triangle which uses drawPolygon methods.
	 * @param x - int array of x coordinates
	 * @param y - int array of y coordinates
	 * @param color - Color for drawing shape
	 * @param fill - boolean to determine solid/outline
	 */
	public Shape(int[] x, int[] y, Color color, boolean fill) {
		this.setxCoords(x);
		this.setyCoords(y);
		this.color = color;
		this.fill = fill;
	}
	
	/**
	 * Constructor for line
	 * @param x - int array of x coordinates for drawing an extremely thin rectangle
	 * @param y - int array of y coordinates
	 * @param color - Color of line
	 */
	public Shape(int[] x, int[] y, Color color) {
		this.setxCoords(x);
		this.setyCoords(y);
		this.color = color;
	}
	
	/**
	 * Constructor for Square which has an equal width and height
	 * @param x - int of initial x coordinate
	 * @param y - int of initial y coordinate
	 * @param width - int for side length, uses width
	 * @param color - Color for drawing shape
	 * @param fill - boolean to determine solid/outline
	 */
	public Shape(int x, int y, int width, Color color, boolean fill) {
		this.width = width;
		this.x = x;
		this.y = y;
		this.color = color;
		this.fill = fill;
	}
	
	/**
	 * Constructor for rectangle and circle
	 * @param x - int for initial x coordinate
	 * @param y - int for initial y coordinate
	 * @param height - int for height of shape, determined from mouseReleased
	 * @param width - int for width of shape, determined from mouseReleased
	 * @param color - Color for drawing shape
	 * @param fill - boolean to determine solid/outline
	 */
	public Shape(int x, int y, int height, int width, Color color, boolean fill) {
		this(x, y, width, color, fill);
		this.height = height;
	}
	
	/**
	 * 
	 * @return boolean fill, which determines if shape is solid or outlined
	 */
	public boolean isFill() {
		return fill;
	}
	/**
	 * @param fill - boolean which determines if shape is solid or outlined
	 */
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	/**
	 * @return int height, which determines height of the shape
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height - int that determines the height of the shape
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return int x, which is the initial x coordinate of the shape
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x - int that is the initial x coordinate of the shape
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return int y, which is the initial y coordinate of the shape
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y - int that is the initial y coordinate of the shape
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return int width, which determines the width of the shape
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width - int that determines the width of the shape
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return Color, which determines the color of the shape
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color - Color that determines the color of the shape
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return int array, which is a list of all x coordinates for the vertices of shape
	 */
	public int[] getxCoords() {
		return xCoords;
	}

	/**
	 * @param xCoords - int array of all x coordinates for the vertices of shape
	 */
	public void setxCoords(int[] xCoords) {
		this.xCoords = xCoords;
	}

	/**
	 * @return int array, which is a list of all y coordinates for the vertices of shape
	 */
	public int[] getyCoords() {
		return yCoords;
	}

	/**
	 * @param yCoords - int array of all y coordinates for the vertices of shape
	 */
	public void setyCoords(int[] yCoords) {
		this.yCoords = yCoords;
	}

	/**
	 * @param g - method sets color of graphics for drawing shape. 
	 */
	public void draw(Graphics g) {
		g.setColor(getColor());
	};
}
