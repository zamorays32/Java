package video_54_InternClassLocal_insideMetodo;

public class defaulKitExplain {
	
	/*
	 paulojes Hace 4 a�os
	 
Buen dia profesor!! La verdad muy bien explicado el tema! Entiendo 
perfectamente lo de las clases internas! Le agredezco y lo felicito 
por la forma de dar clases!! Aunque tengo algunas dudas y preguntas 
con respecto a este video y al anterior, que espero, cuando disponga 
de tiempo, me las pueda responder. Serian las siguientes: 
1) La instruccion public void actionPerformed(ActionEvent evento),
recibe un parametro de tipo ActionEvent. Sin embargo no veo que se
use ese parametro en ningun lugar del metodo. Entonces la pregunta es
�para que sirve ese argumento, si no se usa? � O como es que lo usa entonces? 
2) La instruccion Toolkit.getDefaultToolkit().beep();  Veo que tanto getDefaultToolkit() como beep() son dos metodos de la clase Toolkit. Ahora no entiendo por que hay que poner los dos, y como se entenderia en este caso esa linea. �Que seria realmente beep()? �Un metodo de Toolkit? �O seria como una especie de "metodo" dentro del metodo geetDefaultToolkit?. Esto mismo me pasa con la instruccion System.out.println. Se que System es una clase, pero no me queda claro que es "out" y que es "println". Desde ya le pido disculpas por las molestias! Muchas gracias nuevamente por los cursos! En este momento sigo tambien el de JavaScript! Saludos desde Argentina

	  
1) el m�todo actionPerformed es invocado (llamado) autom�ticamente 
cuando se produce el evento. Cuando hacemos click en un bot�n se est� 
produciendo un evento y por lo tanto en ese momento se llama al m�todo 
actionPerformed adem�s de pasarle por par�metro un objeto evento. 
Esto es complicado de ver sobre todo si se viene de otros lenguajes.
  Tal y como comentamos en los v�deos, los eventos en Java est�n 100% 
  orientados a objetos, es decir, se considera a los eventos como objetos.
  Es por este motivo por lo que cuando pulsamos en un bot�n, aunque no lo veamos,
  realmente estamos construyendo en ese momento un objeto de tipo evento
   (concretamente actionEvent) y se lo pasamos por par�metro al m�todo 
   actionPerformed (al que tambi�n llamamos de forma autom�tica 
   simplemente pulsando un bot�n). Respecto el argumento,
    vemos en los v�deos tambi�n c�mo podemos utilizar el objeto evento 
    para detectar la fuente del evento con el m�todo getSource(), o 
    sea que si lo usamos. 
    
 2) Empecemos por beep(): Efectivamente es un m�todo de la clase Toolkit y
 como nos indica la API, lo que hace es emitir el cl�sico sonido que escuchamos 
 cuando ejecutamos una ventana emergente en nuestro sistema operativo.
 
  getDefaultToolkit(): a ver somo lo explico de forma que se pueda entender. 
  
  Devuelve el entorno de trabajo que estamos utilizando para programar. 
  En mi caso sistema operativo windows con monitor de 1920 x 1080. 
  
  Toolkit entorno=Toolkit.getDefaultToolkit(); 
  
  Esta instrucci�n almacena en la variable entorno nuestro entrono de trabajo.
  Nuestro entorno de trabajo como objeto que es tiene sus propiedades y sus m�todos.
  Podr�amos ahora aplicar entorno.beep() 
  para que nos devuelva el sonido cl�sico
  (ese plin que suena en windows cuando sale una ventana de advertencia). 
  Aqu� lo he hecho en dos pasos Toolkit entorno=Toolkit.getDefaultToolkit();
  y luego entorno.beep(); 
  Pero �por qu� hacerlo en dos pasos si se puede simplificar el c�digo y hacerlo en uno?
   Toolkit.getDefaultToolkit().beep();
    En fin, 
   son temas complejos que requieren normalmente de m�s de un visionado.
    Espero haber aclarado algo. Un saludo	  
	  */

}
