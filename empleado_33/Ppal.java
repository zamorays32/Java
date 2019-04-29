package empleado_33;

public class Ppal {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Jose", 100000, 2019, 12, 17);
		System.out.println(empleado1.getContratoIn());
		System.out.println(empleado1.getSueldo());
		System.out.println(empleado1.getNombre());
		empleado1.setAumentoSueldo(10);
		System.out.println(empleado1.getSueldo());
	}

}
