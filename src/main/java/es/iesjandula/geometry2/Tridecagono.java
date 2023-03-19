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
	private double radio;
	double perimetro;
	double longitud_lado = 5;
	double apotema = 2;
	double area;
	/**
	 * Constructor of the class
	 * 
	 * @param radio with the radio of the circle
	 */
	public Tridecagono(double radio)
	{
		this.radio = radio ;
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
