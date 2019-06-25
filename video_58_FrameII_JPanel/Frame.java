package video_58_FrameII_JPanel;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame() {
		setVisible(true);
		
		setTitle("Java");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int ancho = tamanoPantalla.width;
		int alto  = tamanoPantalla.height;
		
		
		//System.out.println("Altura ="+ alto +" Ancho=" + ancho);
		setSize( ancho/2,alto/2);
		//setSize( 600,450);
		//Image icono = miPantalla.getImage("copia.jpg");
		//setIconImage(icono);
		setLocation(ancho/4, alto/4);
		setLocation(400, 200);
		Lamina miLamina = new Lamina();
		//add(miLamina);
		this.add(miLamina);
	}
}
