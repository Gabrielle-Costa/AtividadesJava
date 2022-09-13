package Retangulo;

public class Retang {

	public double alt;
	public double larg;

	public double area() {

		double area = this.alt * this.larg;
		return area;

	}

	public double perimetro() {

		double p = 2 * (this.alt + this.larg);
		return p;

	}

	public double diagonal() {

		double d = Math.sqrt(Math.pow(this.larg, 2.0) + Math.pow(this.alt, 2.0));
		return d;

	}

	public String toString() {
		return "Area: " 
				+ String.format("%.2f%n", area()) 
				+ "Perimetro: " 
				+ String.format("%.2f%n", perimetro()) 
				+ "Diagonal: " 
				+ String.format("%.2f%n", diagonal());
	}

}
