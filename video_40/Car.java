package video_40;

public class Car {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int chasis;
	private String color;
	int peso_total;
	boolean asientos;
	boolean calefaccion;
	
	
	public Car () {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		chasis  = 500;
	}
	
	
  public String getPeso() {
			  return ("" + chasis);
	}
  
  public int getMotor() {
	  return motor;
}
  
  // SETTER
  
  public void setColor (String color) {
	  this.color = color;
	}
  
  // GETTER
  public String getColor() {
	  return color;
  }
}
