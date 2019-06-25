package video_53_InnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class Reloj {
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj (int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha () {
		
		ActionListener giveTime = new Oyente();
		Timer mitemporizador = new Timer (intervalo, giveTime );
		mitemporizador.start();
	}
	
	private class Oyente implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			Date timeNow  = new Date();
			System.out.println(timeNow);
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}

}
