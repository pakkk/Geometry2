package es.iesjandula.geometry2;

public class pentadecágono implements IPolygon{
	double longitud;
	double apotema;
	public pentadecágono(double longitud,double apotema) {
		this.longitud=longitud;
		this.apotema=apotema;
	}
	


	public double calculatePerimeter() {
		double perimeter =longitud*15;
		return perimeter;
	}

	public double calculateArea() {
		
		return (calculatePerimeter()*apotema)/2;
	}

	public int getNumberOfSides() {
		
		return 15;
	}
}
