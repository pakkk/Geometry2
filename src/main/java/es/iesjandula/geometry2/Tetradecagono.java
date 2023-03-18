package es.iesjandula.geometry2;

public class Tetradecagono implements IPolygon {
	//Atributos de la clase
	private double longitudLado;
	private final double PI = Math.PI;
	
	//Constructor de la clase 
	public Tetradecagono(double longitudLado)
	{
		this.longitudLado = longitudLado;
	}
	//Añadimos getters y setters para la longitud de los lados del poligono
	
	//Getter
	public double getLongitudLado()
	{
		return longitudLado;
	}
	//Setter
	public void setLongitudLado(double longitudLado)
	{
		this.longitudLado = longitudLado;
	}
	
	//Metodos implementados de la interfaz 
	public int getNumberOfSides() {
	//Este metodo determina el numero de lados del poligono, no se podra cambiar en ningun momento	
		return 14;
	}

	public double calculatePerimeter() {
		//Este metodo calcula el perimetro del poligono multiplicando la longitud de los lados con los lados que posee
		return getNumberOfSides() * longitudLado;
	}

	public double calculateArea() {
		//Este metodo calcula el area del poligono usando sus lados, longitud y angulos internos (obtencion por tangente)
		return (getNumberOfSides() * Math.pow(longitudLado, 2)) / (4*Math.tan(PI/getNumberOfSides()));
	}

}
