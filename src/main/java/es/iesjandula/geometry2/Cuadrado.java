/**
 * 
 */
package es.iesjandula.geometry2;

/**
 * @author LuisDavidCastillo
 *
 */
public class Cuadrado implements IPolygon {

	/** Attribute - Side */
	private double side;

	public Cuadrado(double side) {
		this.side=side;
	}
	public int getNumberOfSides() {
		// @return The number of sides in this case is 4
		return 4;
	}

	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		int num_Sides = getNumberOfSides();
		double perimeter=side*num_Sides;
		return perimeter;
	}

	public double calculateArea() {
		// TODO Auto-generated method stub
		double area = side*side;
		return area;
	}

}
