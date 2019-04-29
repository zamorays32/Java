package pildoras;

import java.util.Timer;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carrito = new Car();
		carrito.setColor(JOptionPane.showInputDialog("Pon Color"));
		//System.out.println(carrito.getColor());
		
		JOptionPane.showMessageDialog(null, carrito.getColor());
		
		
	}

}
