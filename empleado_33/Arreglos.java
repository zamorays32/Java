package empleado_33;

public class Arreglos {

	public static void main(String[] args) {

	String nombres[] = {"Juan", "Pedro",  "Rocio"};
	
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		for (String s : nombres) {
			System.out.println(s);
		}
	}

}
