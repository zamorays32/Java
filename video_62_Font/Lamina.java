package video_62_Font;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Lamina extends JPanel {

	
	public Lamina() {

	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		//g2D.draw(new Rectangle2D.Double(100, 100, 200, 150));
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2D.setPaint(Color.BLACK);
		g2D.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double(100,100,200,150);
		g2D.setPaint(Color.BLUE);
		//g2D.draw(rectangulo);
		g2D.fill(rectangulo);
		g2D.setPaint(Color.red);
		g2D.fill(elipse);
		//g2D.draw(elipse);
		//elipse.setFrame(rectangulo);
		//this.setBackground(Color.CYAN);
		this.setBackground(SystemColor.window);
		
	
	
		
		
		
		
		
	}

}
