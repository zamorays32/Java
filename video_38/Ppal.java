package video_38;

import java.io.ObjectInputStream.GetField;

//Curso Java. Métodos static. Vídeo 38

public class Ppal {

	public static void main(String[] args) {

		Empleado employed1 = new Empleado("Juan"  );
		Empleado employed2 = new Empleado("Carlos"  );
		Empleado employed3 = new Empleado("Oriana"  );
		System.out.println(employed1.getInfoEmployed());
		System.out.println(employed2.getInfoEmployed());
		System.out.println(employed3.getInfoEmployed());
		System.out.println(Empleado.getId());
		
	}

}
