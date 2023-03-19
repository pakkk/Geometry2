package es.iesjandula.geometry2;

public class Pentagono implements IPolygon{
	/** Attribute - side */
	private double side;
	/** Attribute - apotema */
	private double apotema;

	/**
	 * Constructor of the class
	 * 
	 * @param side with the side of the Pentagono
	 * @param apotema with the apotema of the Pentagono
	 */
	public Pentagono(double side,double apotema) {
		this.side=side;
		this.apotema=apotema;
	}
	
	/**
	 * @return the sides number.
	 */
	public int getNumberOfSides(){
		System.out.println("Tiene cinco lados");
		return 5;
	}
	
	
	/**
	 * @return the Pentagono of the Pentagono
	 */
	public double calculatePerimeter(){	
		return this.side*5;
	}
	
	/**
	 * @return the area of the Pentagono
	 */
	public double calculateArea() {
		return (this.calculatePerimeter()*this.apotema)/2;
	}
}
