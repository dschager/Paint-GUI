import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Class contains JFrames and JPanels for Canvas, and button windows
 * Contains all buttons and text fields
 *
 */
public class Components {
	
	/**
	 * Method creates everything from JFrames and JPanels, to JButtons and JTextFields
	 * Each buton has an Action Listener which calls a method from Canvas and updates its attributes
	 */
	public void createComponents() {
		//Canvas
		Canvas canvas = new Canvas();
		JFrame canvasFrame = new JFrame("Canvas");
		canvasFrame.setSize(1250, 800);
		canvasFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvasFrame.add(canvas);
		canvasFrame.setVisible(true);
		
		//JFrame and JPanel for buttons
		JFrame buttonFrame = new JFrame("Buttons");
		buttonFrame.setSize(260, 530);
		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		buttonFrame.add(panel);
			
			
		JButton circle = new JButton("Circle"); //Creates button
		circle.setBackground(Color.white);
		circle.setOpaque(true);
		ActionListener circleAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setShape(new Circle());
				canvas.setPencil(false);
			}
		};
		circle.addActionListener(circleAL);

			
		JButton rectangle = new JButton("Rectangle"); //Creates button
		rectangle.setBackground(Color.white);
		rectangle.setOpaque(true);
		ActionListener rectangleAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setShape(new Rectangle());
				canvas.setPencil(false);
			}
		};
		rectangle.addActionListener(rectangleAL);
			
			
		JButton square = new JButton("Square"); //Creates button
		square.setBackground(Color.white);
		square.setOpaque(true);
		ActionListener squareAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setShape(new Square());
				canvas.setPencil(false);
			}
		};
		square.addActionListener(squareAL);
			
			
		JButton triangle = new JButton("Triangle"); //Creates button
		triangle.setBackground(Color.white);
		triangle.setOpaque(true);
		ActionListener triangleAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setShape(new Triangle());				
				canvas.setPencil(false);
			}
		};
		triangle.addActionListener(triangleAL);
			
			
		JButton line = new JButton("Line"); //Creates button
		line.setBackground(Color.white);
		line.setOpaque(true);
		ActionListener lineAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setShape(new Line());
				canvas.setPencil(false);
			}
		};
		line.addActionListener(lineAL);

			
		JButton black = new JButton(); //Creates button
		black.setBackground(Color.black);
		black.setBorderPainted(false);
		black.setOpaque(true);
		ActionListener blackAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(0);
			}
		};
		black.addActionListener(blackAL);
			
			
		JButton green = new JButton(); //Creates button
		green.setBackground(Color.green);
		green.setBorderPainted(false);
		green.setOpaque(true);
		ActionListener greenAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(2);
			}
		};
		green.addActionListener(greenAL);
			
			
		JButton red = new JButton(); //Creates button
		red.setBackground(Color.red);
		red.setBorderPainted(false);
		red.setOpaque(true);
		ActionListener redAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(3);
			}
		};
		red.addActionListener(redAL);
			
			
		JButton blue = new JButton(); //Creates button
		blue.setBackground(Color.blue);
		blue.setBorderPainted(false);
		blue.setOpaque(true);
		ActionListener blueAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(4);
			}
		};
		blue.addActionListener(blueAL);
			
			
		JButton cyan = new JButton(); //Creates button
		cyan.setBackground(Color.cyan);
		cyan.setBorderPainted(false);
		cyan.setOpaque(true);
		ActionListener cyanAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(10);
			}
		};
		cyan.addActionListener(cyanAL);
			
			
		JButton darkGray = new JButton(); //Creates button
		darkGray.setBackground(Color.darkGray);
		darkGray.setBorderPainted(false);
		darkGray.setOpaque(true);
		ActionListener darkGrayAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(12);
			}
		};
		darkGray.addActionListener(darkGrayAL);
			
			
		JButton gray = new JButton(); //Creates button
		gray.setBackground(Color.gray);
		gray.setBorderPainted(false);
		gray.setOpaque(true);
		ActionListener grayAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(1);
			}
		};
		gray.addActionListener(grayAL);
			
		JButton magenta = new JButton(); //Creates button
		magenta.setBackground(Color.magenta);
		magenta.setBorderPainted(false);
		magenta.setOpaque(true);
		ActionListener magentaAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(5);
			}
		};
		magenta.addActionListener(magentaAL);
			
		JButton orange = new JButton(); //Creates button
		orange.setBackground(Color.orange);
		orange.setBorderPainted(false);
		orange.setOpaque(true);
		ActionListener orangeAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(6);
			}
		};
		orange.addActionListener(orangeAL);
			
			
		JButton pink = new JButton(); //Creates button
		pink.setBackground(Color.pink);
		pink.setBorderPainted(false);
		pink.setOpaque(true);
		ActionListener pinkAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(7);
			}
		};
		pink.addActionListener(pinkAL);
			
			
		JButton white = new JButton(); //Creates button
		white.setBackground(Color.white);
		white.setBorderPainted(false);
		white.setOpaque(true);
		ActionListener whiteAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(8);
			}
		};
		white.addActionListener(whiteAL);
			
			
		JButton yellow = new JButton(); //Creates button
		yellow.setBackground(Color.yellow);
		yellow.setBorderPainted(false);
		yellow.setOpaque(true);
		ActionListener yellowAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(9);
			}
		};
		yellow.addActionListener(yellowAL);
			
			
		JButton lightGray = new JButton(); //Creates button
		lightGray.setBackground(Color.lightGray);
		lightGray.setBorderPainted(false);
		lightGray.setOpaque(true);
		ActionListener lightGrayAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setColor(11);
			}
		};
		lightGray.addActionListener(lightGrayAL);
			
			
		JButton fill = new JButton("Fill"); //Creates button
		fill.setBackground(Color.white);
		fill.setOpaque(true);
		ActionListener fillAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setFill(!canvas.isFill());
			}
		};
		fill.addActionListener(fillAL);
			
			
		JButton pencil = new JButton("Pencil"); //Creates button
		pencil.setBackground(Color.white);
		pencil.setOpaque(true);
		ActionListener pencilAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setPencil(true);
			}
		};
		pencil.addActionListener(pencilAL);
			
		
		//Pencil Stroke
		JTextField strokeText = new JTextField("Pencil Stroke Size:");
		strokeText.setBounds(10, 430, 100, 25);
		strokeText.setEditable(false);
		strokeText.setBorder(null);
		JTextField stroke = new JTextField("50");
		stroke.setBounds(125, 430, 50, 25);
			
		JButton setStroke = new JButton("E");
		setStroke.setBackground(Color.white);
		setStroke.setOpaque(true);
		ActionListener setStrokeAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setStroke(Integer.parseInt(stroke.getText()));
			}
		};
		setStroke.addActionListener(setStrokeAL);
		setStroke.setBounds(185, 430, 50, 25);
		
		
		//RGB
		JTextField colorText = new JTextField("RGB: ");
		colorText.setBounds(10, 460, 50, 25);
		colorText.setEditable(false);
		colorText.setBorder(null);
		JTextField rValue = new JTextField();
		rValue.setBounds(100, 460, 25, 25);
		JTextField gValue = new JTextField();
		gValue.setBounds(125, 460, 25, 25);
		JTextField bValue = new JTextField();
		bValue.setBounds(150, 460, 25, 25);
		JButton setRGB = new JButton("E");
		setRGB.setBackground(Color.white);
		setRGB.setOpaque(true);
		ActionListener setRGBAL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int[] rgbArray = {Integer.parseInt(rValue.getText()), Integer.parseInt(gValue.getText()), Integer.parseInt(bValue.getText())};
				canvas.setRgb(rgbArray);
			}
		};
		setRGB.addActionListener(setRGBAL);
		setRGB.setBounds(185, 460, 50, 25);
		
		
		//Boundaries
		circle.setBounds(10, 10, 100, 50); 
		rectangle.setBounds(10, 70, 100, 50);
		square.setBounds(10, 130, 100, 50);
		triangle.setBounds(10, 190, 100, 50);
		line.setBounds(10, 250, 100 ,50);
		fill.setBounds(10, 310, 100, 50);
		pencil.setBounds(10, 370, 100, 50);
			
		black.setBounds(125, 10, 50, 50);
		green.setBounds(185, 250, 50, 50);
		red.setBounds(185, 190, 50, 50);
		blue.setBounds(185, 310, 50, 50);
		cyan.setBounds(125, 310, 50, 50);
		yellow.setBounds(125, 250, 50, 50);
		lightGray.setBounds(125, 70, 50, 50);
		darkGray.setBounds(185, 10, 50, 50);
		gray.setBounds(185, 70, 50, 50);
		magenta.setBounds(185, 130, 50, 50);
		orange.setBounds(125, 190, 50, 50);
		pink.setBounds(125, 130, 50, 50);
		white.setBounds(125, 370, 50, 50);
			
		panel.add(circle);
		panel.add(rectangle);
		panel.add(square);
		panel.add(triangle);
		panel.add(green);
		panel.add(black);
		panel.add(line);
		panel.add(fill);
		panel.add(red);		
		panel.add(blue);
		panel.add(cyan);
		panel.add(darkGray);
		panel.add(gray);
		panel.add(magenta);
		panel.add(orange);
		panel.add(pink);
		panel.add(pencil);
		panel.add(white);
		panel.add(yellow);
		panel.add(lightGray);
		panel.add(strokeText);
		panel.add(stroke);
		panel.add(setStroke);
		panel.add(rValue);
		panel.add(setRGB);
		panel.add(bValue);
		panel.add(gValue);
		panel.add(colorText);

		panel.setLayout(null);
		buttonFrame.setVisible(true);
	}
}
