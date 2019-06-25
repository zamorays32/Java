package video_49_Interfaz;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable {
	
	private String nombre;
	private double sueldo;
	private Date  contrato_in;
	private int Id;
	private static int IdSiguiente = 1 ;
	
	public Empleado (String nombre, double sueldo, int año_in, int mes_in, int dia_in) {
		 this.nombre = nombre;
		 this.sueldo = sueldo;
		 GregorianCalendar calendario = new GregorianCalendar(año_in, mes_in - 1, dia_in);
		 contrato_in = calendario.getTime();
		 Id = IdSiguiente;
		 IdSiguiente++;
		 
	}
	
	public Empleado (String nombre) {
		 this(nombre, 100, 2019,5,7);
		 
	}
	
	public String getNombre() {
			return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getContratoIn () {
		return contrato_in;
	}
	
	public void setAumentoSueldo (double porcentaje) {
		
		double aumento = (sueldo*porcentaje) / 100;
		sueldo += aumento;	
		}
	
	public static int getId () {
		return Empleado.IdSiguiente;
	}
	public  int getId_ () {
		return Id;
	}

	@Override
	public int compareTo(Object o) {
		Empleado e = (Empleado) o ; 
		 if (this.sueldo <e.sueldo) {
			 return -1;
		} if (this.sueldo >e.sueldo) {
			 return 1;
		}
		return 0;
	}

}
