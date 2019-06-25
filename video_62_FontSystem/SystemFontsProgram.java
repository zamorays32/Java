package video_62_FontSystem;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;


public class SystemFontsProgram {

	public static void main(String[] args) {
		
		String letra = JOptionPane.showInputDialog("Ingresa la fuente");
		boolean existe = false ;
		
		
		
		String [] tipoLetras = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		/*for (String string : tipoLetras) {
			System.out.println(tipoLetras);
			}
		*/
		
		for (int i = 0; i < tipoLetras.length; i++) {
			//System.out.println( " N-" + (i+1) + " " + tipoLetras[i]  );
			if (tipoLetras[i].equals(letra)) {
				existe = true;
			}
		}
		if (existe) {
			System.out.println("Existe");
		}else
			System.out.println("No existe");
	}
}
