package es.iesjandula.geometry2;

/**
 * 
 * This class implements the rectangle properties (sides number, perimeter and area) 
 * 
 * 
 *   
 * @author Alejandro Cazalla 
 *
 */
public class Rectangulo implements IPolygon
{
	/** Attribute - base */
	private double base ;
	/** Attribute - height */
	private double height ;
	
	/**
	 * Constructor of the class
	 * 
	 * @param base with the base of the rectangle
	 * @param height with the height of the rectangle
	 */
	public Rectangulo(double base, double height)
	{
		this.base = base ;
		this.height = height ;
	}
	
	/**
	 * @return the sides number. In this case, it is four
	 */
	public int getNumberOfSides()
	{
		return 4 ;
	}

	/**
	 * @return the perimeter of the rectangle
	 */
	public double calculatePerimeter()
	{
		return (2 * this.base) + (2 * this.height) ;
	}

	/**
	 * @return the area of the rectangle
	 */
	public double calculateArea()
	{
		return this.base * this.height ;
	}
}
