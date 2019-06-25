package video_54_InternClassLocal_insideMetodo;

import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Ppal {

	public static void main(String[] args) {
		
		
		Reloj relojito = new Reloj();
		relojito.enMarcha(1000, true);
		//Toolkit entorno = Toolkit.getDefaultToolkit();
		//entorno.beep();
		JOptionPane.showMessageDialog(null, "Pulsa para parar");
		
		System.exit(0);
	}
}
