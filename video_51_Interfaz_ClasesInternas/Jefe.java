package video_51_Interfaz_ClasesInternas;

public class Jefe extends Empleado implements Jefe_Interface {
	
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

	@Override
	public String take_decision(String decition) {
		// TODO Auto-generated method stub
		return ("Decision tomada" + decition );
	}

	@Override
	public double setBonus(double bono) {
		double prima = 1000;
		
		
		return Empleado_Interfaz.bono_base + bono+ prima;
	}

	

	

}
