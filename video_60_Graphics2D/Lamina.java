package video_60_Graphics2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
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
		Ellipse2D elipse = new Ellipse2D.Double(100,100,200,150);
		g2D.draw(rectangulo);
		g2D.draw(elipse);
		//elipse.setFrame(rectangulo);
		//g2D.draw(elipse);
		g2D.draw(new Line2D.Double(100, 100, 300, 250));
		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();
		double radio = 125;
		Ellipse2D circulo  = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX + radio, centroY + radio);
		g2D.draw(circulo);
		
		
		
		
	}

}
