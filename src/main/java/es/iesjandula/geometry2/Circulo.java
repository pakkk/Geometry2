package es.iesjandula.geometry2;

/**
 * 
 * This class implements the circle properties (sides number, perimeter and area)
 * 
 * 
 * @author Paco Benítez
 *
 */
public class Circulo implements IPolygon
{
	/** Attribute - Radio */
	private double radio ;
	
	/**
	 * Constructor of the class
	 * 
	 * @param radio with the radio of the circle
	 */
	public Circulo(double radio)
	{
		this.radio = radio ;
	}
	
	/**
	 * @return the sides number. In this case, it is zero
	 */
	public int getNumberOfSides()
	{
		return 0 ;
	}

	/**
	 * @return the perimeter of the circle
	 */
	public double calculatePerimeter()
	{
		return 2 * Math.PI * this.radio ;
	}

	/**
	 * @return the area of the circle
	 */
	public double calculateArea()
	{
		return Math.PI * Math.pow(this.radio, 2) ;
	}
}
