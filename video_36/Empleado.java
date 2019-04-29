package video_36;

public class Empleado {
	
	private final String nombre;
	private String dpto;
	
	public Empleado (String nombre) {
		
		this.nombre = nombre;
		dpto = "Administracion";
	}
	
	public void setSeccion (String seccion) {
		this.dpto = seccion;
	}
	
	/*public void setNombre (String nombre) {
		this.nombre = nombre;
	}*/
	
	public String getInfoEmployed () {
		
		return "Nombre:" + nombre + " Dpto:" + dpto;
	}
	
}
