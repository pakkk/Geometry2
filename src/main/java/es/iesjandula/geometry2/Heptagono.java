package es.iesjandula.geometry2;

public class Heptagono implements IPolygon {
	
	
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 7;
	}

	public double calculatePerimeter() {
		double lado = 5;
	
		return lado * getNumberOfSides() ;
		//use this funtion for calculate perimeter. 
		
	}

	public double calculateArea() {
		
		double apotema = 6;
		
		
		
		return (apotema * calculatePerimeter())/2;
		//use this funtion for calculate area.
	}

}
