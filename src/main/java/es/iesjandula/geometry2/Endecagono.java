package es.iesjandula.geometry2;

public class Endecagono implements IPolygon {
	
	int numberOfSides=11;
	double base=2;
	double altura=6;
	
	
	public int getNumberOfSides() {
		//method that return number of sides to polygon.
		return numberOfSides;
	} 

	public double calculatePerimeter() {
		// this method calculate a perymeter of polygon and return this value fhgfcc
		double perymeter;
		perymeter=this.base*11;
		return perymeter;
	}

	public double calculateArea() {
		// this method calculate value to area to the polygon and return this value
		double area=(this.calculatePerimeter()*this.altura)/2;
		return area;
	}

}
