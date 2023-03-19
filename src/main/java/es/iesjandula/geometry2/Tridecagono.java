package es.iesjandula.geometry2;

/**
 * 
 * This class implements the circle properties (sides number, perimeter and area)
 * 
 * 
 * @author Miguel Ríos
 *
 */
public class Tridecagono implements IPolygon
{
	/** Attribute - Radio */
	double perimetro;
	double longitud_lado;
	double apotema = 2;
	double area;
        
	/**
	 * Constructor of the class
         * @param longitud_lado
	 */
	public Tridecagono(double longitud_lado)
	{
		this.longitud_lado = longitud_lado ;
	}
	
	/**
	 * @return the sides number. In this case, it is zero
	 */
	public int getNumberOfSides()
	{
		return 13 ;
	}

	/**
	 * @return the perimeter of the circle
	 */
	public double calculatePerimeter()
	{
		perimetro = 13 * longitud_lado;
		return perimetro;
	}

	/**
	 * @return the area of the circle
	 */
	public double calculateArea()
	{
		apotema = longitud_lado / (2 * (3.1416 / 13));
		area = (13 * longitud_lado * apotema) / 2;
		return area;
	}
}