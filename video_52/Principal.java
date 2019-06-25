package video_52;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Principal {

	public static void main(String[] args) {
		
		//Oyente giveTime = new Oyente();
		ActionListener giveTime = new Oyente();
		
		Timer mitemporizador = new Timer (2000, giveTime );
		mitemporizador.start();
		//Date timeNow  = new Date();
		//System.out.println(timeNow);
		JOptionPane.showMessageDialog(null, "Pulsa para salir");
		System.exit(0);

	}
	
	
}
class Oyente implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date timeNow  = new Date();
		System.out.println(timeNow);
	}
}