package es.iesjandula.geometry;

/**
 * 
 * This class implements the circle properties (sides number, perimeter and area)
 * 
 * 
 * @author Juan Sutil
 *
 */

public class Hexadecagono implements IPolygon{
	/** Attribute - Radio */
	private double longitudLado ;
	
	/**
	 * Constructor of the class
	 * 
	 * @param radio with the radio of the circle
	 */
	public Hexadecagono(double longitudLado)
	{
		this.longitudLado = longitudLado;
	}
	
	/**
	 * @return the sides number. In this case, it is zero
	 */
	public int getNumberOfSides()
	{
		return 16 ;
	}

	/**
	 * @return the perimeter of the circle
	 */
	public double calculatePerimeter()
	{
		return longitudLado * 16;
	}

	/**
	 * @return the area of the circle
	 */
	public double calculateArea()
	{
		return 20.1094  * Math.pow(longitudLado, 2);
	}
}
