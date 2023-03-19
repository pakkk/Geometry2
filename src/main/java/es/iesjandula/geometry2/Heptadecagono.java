package es.iesjandula.geometry;

/**
 * 
 * This class implements the circle properties (sides number, perimeter and area)
 * 
 * 
 * @author Juan Sutil
 *
 */

public class Heptadecagono implements IPolygon{
	/** Attribute - Radio */
	private double longitudLado ;
	
	/**
	 * Constructor of the class
	 * 
	 * @param radio with the radio of the circle
	 */
	public Heptadecagono(double longitudLado)
	{
		this.longitudLado = longitudLado;
	}
	
	/**
	 * @return the sides number. In this case, it is zero
	 */
	public int getNumberOfSides()
	{
		return 17 ;
	}

	/**
	 * @return the perimeter of the circle
	 */
	public double calculatePerimeter()
	{
		return longitudLado * 17;
	}

	/**
	 * @return the area of the circle
	 */
	public double calculateArea()
	{
		return 22.7355  * Math.pow(longitudLado, 2);
	}
}
