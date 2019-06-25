package video61_Colors;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	
	public Frame () {
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setTitle("Java");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Lamina miLamina = new Lamina();
		this.add(miLamina);
		
	}

}


