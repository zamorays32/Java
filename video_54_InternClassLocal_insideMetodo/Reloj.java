package video_54_InternClassLocal_insideMetodo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class Reloj {
	
	
	
	/*public Reloj () {
	}*/
	
	public void enMarcha (int intervalo,  boolean sonido) {
		
		 class Oyente implements ActionListener{
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Date timeNow  = new Date();
					System.out.println(timeNow);
					if (sonido) {
						//Toolkit.getDefaultToolkit().beep();
						Toolkit entorno = Toolkit.getDefaultToolkit();
						entorno.beep();
					}
				}
			}
		 
		ActionListener giveTime = new Oyente();
		Timer mitemporizador = new Timer (intervalo, giveTime );
		mitemporizador.start();
	}
}
