package video_39;

public class Ppal {

	public static void main(String[] args) {
		/*Empleado empleado1 = new Empleado("Jose", 100000, 2019, 12, 17);
		Empleado empleado2 = new Empleado("Juan", 200000, 2019, 05, 05);
		System.out.println(empleado1.getContratoIn());
		System.out.println(empleado2.getContratoIn());
		System.out.println(empleado1.getSueldo());
		System.out.println(empleado1.getNombre());
		empleado1.setAumentoSueldo(10);
		empleado2.setAumentoSueldo(10);
		System.out.println(empleado1.getSueldo());
		System.out.println(empleado2.getSueldo());
		*/
		Empleado [] misEmple = new Empleado [4];
		
		misEmple[0] = new Empleado("Juan", 10000, 2019, 12, 17);
		misEmple[1] = new Empleado("Pedro", 10000, 2019, 12, 17);
		misEmple[2] = new Empleado("Jose", 10000, 2019, 12, 17);
		misEmple[3] = new Empleado("Jesus");
		
		/*for (int i = 0; i < misEmple.length; i++) {
			
			System.out.println(misEmple[i].getNombre());
			
		}*/
		for (Empleado e : misEmple) {
			System.out.println(e.getNombre() + " " + e.getContratoIn());
		}
	}
}
