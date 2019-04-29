package video_40;

import java.util.Timer;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carrito = new Car();
		Jepeta camioneta = new Jepeta(12,3500);
		//carrito.setColor(JOptionPane.showInputDialog("Pon Color"));
		//System.out.println(carrito.getColor());
		
		//JOptionPane.showMessageDialog(null, carrito.getColor());
		camioneta.setColor("Azul");
		System.out.println(camioneta.getMotor());
		System.out.println(camioneta.getPeso() + " " + camioneta.getColor() );
		
		
	}

}
