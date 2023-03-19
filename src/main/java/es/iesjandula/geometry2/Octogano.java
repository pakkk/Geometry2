package es.iesjandula.geometry2;
/**
 * 
 * This class implements the circle properties (sides number, perimeter and area)
 * 
 * 
 * @author Alvaro Marmol Romero
 *
 */
public class Octogano implements IPolygon{
	private int nLados=8;
	double longXlado=8;
	public int getNumberOfSides() {
		return nLados;
	}
	Octogano(double longXlado){
			this.longXlado=longXlado;
	}
	public double calculatePerimeter() {
		
		return getNumberOfSides()*longXlado;
	}
	public double calculateArea() {
		double apotema = getNumberOfSides() / Math.sqrt(2.0 - Math.sqrt(2.0));
		double area = (getNumberOfSides() * apotema) / 2.0;
		return area;
	}
	
}
