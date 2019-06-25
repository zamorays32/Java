package video_46_Classes.Abstractas;

public class Jefe extends Empleado {
	
	private double bono;
	
	public Jefe (String nombre, double sueldo, int año_in, int mes_in, int dia_in) {
		
		super(nombre,sueldo,año_in,mes_in,dia_in);
		
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + bono;
	}

}
