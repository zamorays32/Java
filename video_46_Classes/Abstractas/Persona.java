package video_46_Classes.Abstractas;

public abstract  class Persona {
	
	private String nombre;

	public Persona(String nombre) {
		
		this.nombre = nombre;
	}

	
	public abstract String getDescripcion ();
	
	public String getNombre() {
		return nombre;
	}

}
