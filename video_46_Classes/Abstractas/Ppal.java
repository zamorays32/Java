package video_46_Classes.Abstractas;

public class Ppal {

	public static void main(String[] args) {
		
		
		Persona     [] lasPersonas = new Persona [2];
		lasPersonas[0] = new Empleado("Juan", 10000, 2019, 12, 17);
		lasPersonas[1] = new Alumno ("Oriana", "6 grado");
		
		for (Persona p : lasPersonas) {
			System.out.println(p.getDescripcion());
			//System.out.println(p.getNombre());
		}
	}
}
