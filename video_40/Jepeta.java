/**
 * 
 */
package video_40;


public class Jepeta extends Car {
	
	private int n_puestos;
	private int capacidadCarga;
	/*
	public Jepeta () {
	}
	*/
	public Jepeta (int n_puestos, int capacidadCarga) {
		
		//super();
		
		this.n_puestos = n_puestos;
		this.capacidadCarga = capacidadCarga;
	}
	
	public String getDatailsJepeta () {
		
		return ("Puesto:" + n_puestos +" Capacidad carga:"+ capacidadCarga);
	}
	

}
