package video57_swingFrameII;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marco extends JFrame {
	
	public Marco () {
		setVisible(true);
		//setSize(500, 300);
		//setLocationRelativeTo(null);
		setTitle("Java");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int ancho = tamanoPantalla.width;
		int alto  = tamanoPantalla.height;
		
		System.out.println("Altura ="+ alto +" Ancho=" + ancho);
		setSize( ancho/2,alto/2);
		Image icono = miPantalla.getImage("copia.jpg");
		setIconImage(icono);
		
		
		setLocation(ancho/4, alto/4 );
	}

}
