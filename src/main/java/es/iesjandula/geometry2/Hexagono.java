package es.iesjandula.geometry2;
import java.lang.Math;
public class Hexagono {
	
	/** Attribute - Radio */
	private double longLado;
	private double apotema;
	private double radio;
	
	/**
	 * Constructor of the class
	 * 
	 * @param apotema with the apotema of the hexagono
	 */
	public Hexagono(double longLado,double radio)
	{
		this.longLado = longLado ;
		this.radio = radio;
	}
	
	/**
	 * @return the sides number.
	 */
	public int getNumberOfSides()
	{
		return 6 ;
	}

	/**
	 * @return the perimeter of the hexagono
	 */
	public double calculatePerimeter()
	{
		return longLado*getNumberOfSides();
	}

	/**
	 * @return the area of the hexagono
	 */
	public double calculateArea()
	{
		apotema = Math.sqrt(Math.pow(radio, 2) - Math.pow(longLado/2, 2));
		return (calculatePerimeter()*apotema)/2 ;
	}

}

