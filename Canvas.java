import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;
import javax.swing.JPanel;

/**
 * Canvas extends JPanel and overrides mouseListeners. MouseListener draws shapes depending on attributes affected from components in Components
 *
 */
@SuppressWarnings("serial")
public class Canvas extends JPanel {
	private ArrayList<Shape> shapes = new ArrayList<Shape>(); 
	private int initialX; 
	private int initialY; 
	private int color;
	private Shape shape;
	private boolean fill = true;
	private boolean pencil = false;
	private int stroke = 50;
	private int[] rgb;

	/**
	 * @return int array of RGB values for custom colors
	 */
	public int[] getRgb() {
		return rgb;
	}

	/**
	 * @param rgb - int array containing three ints corresponding to RGB values
	 * Updates color to 13 which is designated for custom colors
	 */
	public void setRgb(int[] rgb) {
		this.rgb = rgb;
		color = 13;
	}
	/**
	 * @param color - Color that sets Color of shape determined by buttons in Components
	 */
	public void setColor(int color) {
		this.color = color;
	}
	/**
	 * @return Color determined by color attribute and rgb array
	 */
	public Color getColor() {
		try {
			if (this.color == 0) {
				return Color.black;
			}
			else if (this.color == 1){
				return Color.gray;
			}
			else if (this.color == 2) {
				return Color.green;
			}
			else if (this.color == 3){
				return Color.red;
			}
			else if (this.color == 4){
				return Color.blue;
			}
			else if (this.color == 5){
				return Color.magenta;
			}
			else if (this.color == 6){
				return Color.orange;
			}
			else if (this.color == 7){
				return Color.pink;
			}
			else if (this.color == 8){
				return Color.white;
			}
			else if (this.color == 9){
				return Color.yellow;
			}
			else if (this.color == 10) {
				return Color.cyan;
			}
			else if (this.color == 11) {
				return Color.lightGray;
			}
			else if (this.color == 12) {
				return Color.darkGray;
			}
			else {
				return new Color(rgb[0], rgb[1], rgb[2]);
			}
		} catch (java.lang.IllegalArgumentException e) {
			if (rgb[0] > 255) {
				rgb[0] = 255;
			}
			if (rgb[1] > 255) {
				rgb[1] = 255;
			}
			if (rgb[2] > 255) {
				rgb[2] = 255;
			}
			if (rgb[0] < 0) {
				rgb[0] = 0;
			}
			if (rgb[1] < 0) {
				rgb[1] = 0;
			}
			if (rgb[2] < 0) {
				rgb[2] = 0;
			}
			return new Color(rgb[0], rgb[1], rgb[2]);
		}
		
	}
	/**
	 * @param shape - Sets drawn shape from button presses in Component
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	/**
	 * @return Shape which is to be drawn
	 */
	public Shape getShape() {
		return shape;
	}
	/**
	 * @return boolean fill which determines if shape is solid/outlined
	 */
	public boolean isFill() {
		return fill;
	}
	/**
	 * @param fill set by button in component
	 */
	public void setFill(boolean fill) {
		this.fill = fill;
	}

	/**
	 * @return boolean pencil which determines if pencil is activated
	 */
	public boolean isPencil() {
		return pencil;
	}
	/**
	 * @param pencil - determines if pencil is activated or deactivated
	 */
	public void setPencil(boolean pencil) {
		this.pencil = pencil;
	}
	/**
	 * @return int stroke which determines size of circles drawn by pencil
	 */
	public int getStroke() {
		return stroke;
	}
	/**
	 * @param stroke - sets the size of circles drawn by pencil
	 */
	public void setStroke(int stroke) {
		this.stroke = stroke;
	}
	
	
	/**
	 *  Contains mouseListeners and paintComponent
	 */
	public Canvas() {
		addMouseMotionListener(new MouseMotionListener() {	// An anonymous class is being used to create this object. A private object defines the interface

			/**
			 * MouseDragged is activated if isPencil() is activated. 
			 * Method draws circle dependent on coordinates of mouse, color selected, stroke size, and fill boolean
			 */
			@Override
			public void mouseDragged(MouseEvent e) {
				if (isPencil()) {
					shapes.add(new Circle(e.getX() - getStroke()/2, e.getY() - getStroke()/2, getStroke(), getStroke(), getColor(), isFill()));
					repaint();
				}
			}

			@Override
			public void mouseMoved(MouseEvent e) {}
		});
		
		
		addMouseListener(new MouseListener() {
			/**
			 * Method sets initial coordinates of mouse to be used when drawing shapes
			 */
			@Override
			public void mousePressed(MouseEvent e) {
				//Get Initial X and Y
				initialX = e.getX();
				initialY = e.getY();
			}
			/**
			 * Method activates when Mouse is released, activates if pencil is deactivated.
			 * Method is dependent on shape selected, color, fill boolean, and initial coordinates.
			 * Method contains math for determining how shape is drawn
			 */
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!isPencil()) {
				if (getShape() instanceof Circle) {
					shapes.add(new Circle(initialX, initialY, Math.abs(initialY - e.getY()), Math.abs(initialX - e.getX()), getColor(), isFill()));	
				}
				else if (getShape() instanceof Rectangle) {
					shapes.add(new Rectangle(initialX, initialY, Math.abs(initialY - e.getY()), Math.abs(initialX - e.getX()), getColor(), isFill()));
				}
				else if (getShape() instanceof Square) {
					shapes.add(new Square(initialX, initialY, Math.abs(((initialX - e.getX()) + (initialY - e.getY()))/2), getColor(), isFill()));
				}
				else if (getShape() instanceof Triangle){
					double length = Math.sqrt(Math.pow(e.getX() - initialX, 2) + Math.pow(e.getY() - initialY, 2));
					double slope = (initialY - e.getY())/(initialX - e.getX());
					double angle = 90 - Math.atan(slope);
					
					int[] x = {initialX, e.getX() + (int) (length*Math.cos(angle)) , e.getX()};
					int[] y = {initialY, e.getY() - (int) (length*Math.sin(angle)), e.getY()};
					shapes.add(new Triangle(x, y, getColor(), isFill()));
				}
				else if (getShape() instanceof Line){
					int[] x = {initialX, initialX + 1, e.getX() + 1, e.getX()};
					int[] y = {initialY, initialY + 1, e.getY() + 1, e.getY()};
					shapes.add(new Line(x, y, getColor()));
				}
				else {
					throw new RuntimeErrorException(null, "Invalid Shape");
				}
				repaint();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
	}
	
	/**
	 * Method draws shapes in Array.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);		//Example of overridden 
		g.setColor(getColor());
		for (Shape shape: shapes) {
			shape.draw(g);
		}
	}	
}