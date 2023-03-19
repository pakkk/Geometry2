package es.iesjandula.geometry2;
//creamos una clase implemantada de IPolygon para obtener las clases
public class dodecagono implements IPolygon{
	double lado=3;
	double apotema=2;
	//creamos lado y apotema y le damos valor
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 12;
		//en esta clase indica el numero de lados que tiene la figura
	}

	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return lado*getNumberOfSides();
		//en esta clase calculamos el perimetro de la figura
	}

	public double calculateArea() {
		
		return apotema*calculatePerimeter()/2;
		//en esta clase calculamos el area de la figura
	}

}
