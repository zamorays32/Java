package video_62_FontSystem;

import java.awt.GraphicsEnvironment;


public class SystemFonts {

	public static void main(String[] args) {
		
		
		String [] tipoLetras = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		/*for (String string : tipoLetras) {
			System.out.println(tipoLetras);
			}
		*/	
		for (int i = 0; i < tipoLetras.length; i++) {
			System.out.println( " N-" + (i+1) + " " + tipoLetras[i]  );
		}
	}
}
