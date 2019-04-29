package video_36;

//Curso Java. Constantes Uso final. Vídeo 36

public class Ppal {

	public static void main(String[] args) {

		Empleado employed1 = new Empleado("Juan");
		System.out.println(employed1.getInfoEmployed());
		
		employed1.setSeccion("Sistemas");
		System.out.println(employed1.getInfoEmployed());
		
		//employed1.setNombre("Pedro");
		System.out.println(employed1.getInfoEmployed());
	}

}
