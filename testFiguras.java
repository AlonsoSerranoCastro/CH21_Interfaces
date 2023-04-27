import calculo.AreasPerimetros;

public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado ("Picasso",10);
		Rectangulo r1 = new Rectangulo("MTGTABLE",10,15);
		Rombo r2 = new Rombo ("RombosMan", 10,5,10);

		
		AreasPerimetros.areaPerimetro(t1);
		AreasPerimetros.areaPerimetro(t2);
		AreasPerimetros.areaPerimetro(c1);
		AreasPerimetros.areaPerimetro(r1);
		AreasPerimetros.areaPerimetro(r2);

		
	}//main

}//class testFiguras