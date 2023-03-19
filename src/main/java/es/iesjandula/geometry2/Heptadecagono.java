package es.iesjandula.geometry2;

/**
 * 
 * This class implements the circle properties (sides number, perimeter and area)
 * 
 * 
 * @author Verdejo
 *
 */

public class Heptadecagono implements IPolygon{

	private double longitudLado ;

	public Heptadecagono(double longitudLado)
	{
		this.longitudLado = longitudLado;
	}
	
	
	public int getNumberOfSides()
	{
		return 17 ;
	}

	
	public double calculatePerimeter()
	{
		return longitudLado * 17;
	}

	
	public double calculateArea()
	{
		return 22.7355  * Math.pow(longitudLado, 2);
	}
}
