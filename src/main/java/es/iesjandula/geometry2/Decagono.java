package es.iesjandula.geometry2;
	/**
	 * 
	 * @author JavierMartinezMegias
	 *
	 */
public class Decagono implements IPolygon {
	
	/** Attribute - lado */
	private double lado ;
	
	
	/**
	 * Constructor of the class
	 * @param radio with the radio of the decagono
	 */
	public Decagono(double lado)
	{
		this.lado = lado ;
	}
	
	/**
	 * @return the sides number. In this case, it is 10
	 */
	public int getNumberOfSides()
	{
		return 10 ;
	}

	/**
	 * @return the perimeter of the decagono
	 */
	public double calculatePerimeter()
	{
		return this.lado * 10 ;
	}

	/**
	 * @return the area of the circle
	 */
	public double calculateArea()
	{
		return ((Math.pow(5, 2))/(2*Math.tan(Math.PI/10)));
	}

}
