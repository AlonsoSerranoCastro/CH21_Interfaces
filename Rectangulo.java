import calculo.Calculo;

public class Rectangulo implements Calculo {
	private String name;
	private double altura;
	private double base;
	
	public Rectangulo(String name, double altura, double base) {
		super();
		this.name = name;
		this.altura = altura;
		this.base = base;
	}//constructor
	
	public double calcularArea() {
		return getBase()*getAltura();
	}//calcularArea
	public double calcularPerimetro() {
		return (getBase()*2+getAltura()*2);
	}//calcularPerimetro


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", altura=" + altura + ", base=" + base + "]";
	}//toString
	
}//class Rectangulo
