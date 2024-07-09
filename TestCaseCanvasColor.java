import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;

class TestCaseCanvasColor {
	
	/**
	 * This case tests the setColor method by setting the specific color of the canvas to 
	 * each of the defined colors. Correct code returns true for the test. 
	 */
	
		@Test
		void testSetColor() {
			
			Canvas canvas = new Canvas();
			
			canvas.setColor(0);
		    assert(canvas.getColor().equals(Color.black));
		    
		    canvas.setColor(1);
		    assert(canvas.getColor().equals(Color.gray));
		    
		    canvas.setColor(2);
		    assert(canvas.getColor().equals(Color.green));
		    
		    canvas.setColor(3);
		    assert(canvas.getColor().equals(Color.red));
		    
		    canvas.setColor(4);
		    assert(canvas.getColor().equals(Color.blue));
		    
		    canvas.setColor(5);
		    assert(canvas.getColor().equals(Color.magenta));
		    
		    canvas.setColor(6);
		    assert(canvas.getColor().equals(Color.orange));
		    
		    canvas.setColor(7);
		    assert(canvas.getColor().equals(Color.pink));
		    
		    canvas.setColor(8);
		    assert(canvas.getColor().equals(Color.white));
		    
		    canvas.setColor(9);
		    assert(canvas.getColor().equals(Color.yellow));
		    
		    canvas.setColor(10);
		    assert(canvas.getColor().equals(Color.cyan));
		    
		    canvas.setColor(11);
		    assert(canvas.getColor().equals(Color.lightGray));
		    
		    canvas.setColor(12);
		    assert(canvas.getColor().equals(Color.darkGray));
		    
		 
	}
		
		
		
		/*
		 * This case creates a new Canvas which sets the fill attribute to true
		 * using the setFill method. We then check to see if the isFill method 
		 * returns true. If they match the test passes.
		 */
		
		@Test
		public void testSetFill() {
			Canvas canvas = new Canvas();
			boolean expected = true;
			canvas.setFill(expected);
			boolean result = canvas.isFill();
			assertEquals(expected, result);
		}
		/*
		 * After creating a new canvas, we set the rgb attritbute to a new array. 
		 * We then use getRGB to retrieve these values. We then compare the retrieved
		 * value to the original array.
		 */
			
		@Test
		void testSetRgb() {
			
			Canvas canvas = new Canvas();
			
			int[] customRgbColor = {50, 100, 150};
		    canvas.setRgb(customRgbColor);
		    canvas.setColor(13);
		    
		    assert(canvas.getColor().equals(new Color(50, 100, 150)));
			
		}

}