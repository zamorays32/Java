package video_38;

public class Empleado {
	
	//private int Static id = 0;
	private final String nombre;
	private String dpto;
	private int Id;
	private static int IdSiguiente = 1 ;
	
	public Empleado (String nombre) {
		
		this.nombre = nombre;
		dpto = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
		
	}
	
	public void setSeccion (String dpto) {
		this.dpto = dpto;
	}
	
	/*public void setNombre (String nombre) {
		this.nombre = nombre;
	}*/
	
	public String getInfoEmployed () {
		
		return "ID:" +Id + " Nombre:" + nombre + " Dpto:" + dpto;
	}
	
	public static int getId () {
		return Empleado.IdSiguiente;
	}
	
}
