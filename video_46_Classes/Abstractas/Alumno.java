package video_46_Classes.Abstractas;

public class Alumno extends Persona {
	
	private String carrera;
	private String nombre;

	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
		this.nombre = nombre;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Carrera del alumno " +nombre  + " " + carrera;
	}

}
