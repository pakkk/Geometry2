package es.iesjandula.geometry2;

public class Eneagono implements IPolygon{
	/** Attribute - side */
	private double side;
	/** Attribute - apotema */
	private double apotema;

	/**
	 * Constructor of the class
	 * 
	 * @param side with the side of the enneagon
	 * @param apotema with the apotema of the enneagon
	 */
	public Eneagono(double side,double apotema) {
		this.side=side;
		this.apotema=apotema;
	}
	
	/**
	 * @return the sides number.
	 */
	public int getNumberOfSides(){
		System.out.println("Tiene nueve lados");
		return 9;
	}
	
	
	/**
	 * @return the perimeter of the enneagon
	 */
	public double calculatePerimeter(){	
		return this.side*9;
	}
	
	/**
	 * @return the area of the enneagon
	 */
	public double calculateArea() {
		return (this.calculatePerimeter()*this.apotema)/2;
	}
}
