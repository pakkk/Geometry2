package es.iesjandula.geometry2;

public class Triangulo implements IPolygon 
{
	//Declaramos las variables en el cual la base es igual la base del triangulo, la altura la distancia que hay desde la base hasta la union del triangulo; el lateral1 un lado del triangulo
	//y el lateral 2 el otro lado del triangulo
	private double base, altura, lateral1, lateral2;
	
	// Solicitamos al usuario que nos de los datos del triangulo
	public Triangulo(double base, double altura, double lateral1, double lateral2) 
	{
		System.out.println("Dime la base del triangulo");
		this.base=base;
		System.out.println("Dime la altura del triangulo");
		this.altura=altura;
		System.out.println("Dime el lateral izquierdo del triangulo");
		this.lateral1=lateral1;
		System.out.println("Dime el lateral derecho del triangulo");
		this.lateral2=lateral2;
	}
	
	// Devolvemos el numero de lados del triangulo que en este caso son tres lados
	public int getNumberOfSides() 
	{
		return 3;
	}
	
	/**
	 * @return Devolvemos el Perimetro del triangulo
	 */
	public double calculatePerimeter() 
	{
		return lateral1+lateral2+base;
		
	}
	
	/**
	 * @return Devolvemos el area del Triangulo
	 */
	public double calculateArea() {
		//En este metodo lo que estamos realizando es calcular el Area de un triangulo en el cual es base * altura /2
		return (base*altura/2);
	}
	
}
