package calculo;

public class AreasPerimetros {
		public static void areaPerimetro(Calculo z) {
			System.out.println(z);
			System.out.println("+========================================");
			System.out.println("|El área de ["+z.getName()+"] es: " + z.calcularArea() + 
					"\n" + "|El perímetro de ["+z.getName()+"] es: " + z.calcularPerimetro());
			System.out.println("+========================================");
		}//imprimirCalculo
}//calculo
