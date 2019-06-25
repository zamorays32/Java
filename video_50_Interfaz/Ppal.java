package video_50_Interfaz;

import java.util.Arrays;

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
		Jefe  edwin = new Jefe("Edwin", 1000, 2000, 05, 01);
		edwin.setBono(100);
		//System.out.println(edwin.getBono());
		//System.out.println(edwin.getId_()+ " Edwin " + edwin.getSueldo());
		Empleado [] misEmple = new Empleado [6];
		
		misEmple[0] = new Empleado("Juan",  300, 2019, 12, 17);
		misEmple[1] = new Empleado("Pedro", 100, 2019, 12, 18);
		misEmple[2] = new Empleado("Jose",  400, 2019, 12, 19);
		misEmple[3] = new Empleado("Jesus");
		misEmple[4] = edwin;
		misEmple[5] = new Jefe ("Sonia", 2000, 2000, 05, 01);
		Empleado supervisora = new Jefe ("Sonia II", 2000, 2000, 05, 01);
		Comparable compa = new Empleado ("Jose II",  400, 2019, 12, 19);
		//Arrays.sort(misEmple);
		Obrero obrerito = new Obrero();
		System.out.println(edwin.take_decision(" Bono pa todos"));
		System.out.println(misEmple[5].take_decision("Aca si la toma"));
		
		if (supervisora instanceof Comparable) {
			System.out.println("Si es instancia de Empleado");
		}if(compa instanceof Comparable)
			{
			System.out.println("Es instancia de Empleado");
		}
		
		if(obrerito instanceof Comparable)
		{
		System.out.println("Es instancia de Empleado");
	}else
		System.out.println("No es instancia de Empleado");
		for (Empleado e : misEmple) {
			e.setAumentoSueldo(10);
		}
		
		
		
		/*for (int i = 0; i < misEmple.length; i++) {
			
			System.out.println(misEmple[i].getNombre());
			System.out.println(misEmple[i].getId_());
			
		}*/
		
		
		for (Empleado e : misEmple) {
			//System.out.println(e.getNombre() + " " + e.getContratoIn()  + " ID:" +e.getId_() + "  sueldo"
		//			+ "   +  aumento  " + e.getSueldo());
		}
	}
}
