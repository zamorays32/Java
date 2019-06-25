package video_53_InnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Ppal {

	public static void main(String[] args) {
		
		
		Reloj relojito = new Reloj(2000, true);
		relojito.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa para parar");
		System.exit(0);
		
		
		

	}

}
