package es.iesjandula.geometry2;

/**
 * 
 * @author Paco Benítez
 *
 */
public interface IPolygon
{
	/**
	 * @return the sides number of the polygon
	 */
	int getNumberOfSides() ;
	
	
	/**
	 * @return the perimeter of the polygon
	 */
	double calculatePerimeter() ;
	
	/**
	 * @return the area of the polygon
	 */
	double calculateArea() ;
}
