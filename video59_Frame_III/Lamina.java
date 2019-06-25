package video59_Frame_III;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lamina extends JPanel {

	
	public Lamina() {

	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawRect(30, 50, 300, 200);
		g.drawLine(100, 100, 300, 200);
		
	}

}
