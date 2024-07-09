import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Color;
import static org.junit.Assert.assertEquals;

public class TestCaseShapeWidth {
	
/*
 * We create a square object then set it's width to 50 using setWidth. We 
 * then test that the getWidth method returns 50 by using assertEquals. If
 * getWidth returns a different value, then the test fails.
 */

	@Test
	public void testGetWidthAndSetWidth() {
       Square s = new Square();
       int expectedWidth = 50;
       s.setWidth(expectedWidth);
       int actualWidth = s.getWidth();
       assertEquals(expectedWidth, actualWidth);
    }
	
	
/*
 * We create a cirlce then set it's X to 10 using setX and Y to 20 using setY. We 
 * then test that the getX and getY method returns 10 and 20 by using assertEquals. If
 * getX and getY returns a different value, then the test fails.
 */
	@Test
	public void testGetXAndSetX() {
		Circle c = new Circle();
		c.setX(10);
		assertEquals(10, c.getX());
		
	}
	
	@Test
	public void testGetYAndSetY() {
		Circle c = new Circle();
		c.setY(20);
		assertEquals(20, c.getY());
		
	}

}
