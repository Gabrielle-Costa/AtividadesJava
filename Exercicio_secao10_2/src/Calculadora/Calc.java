package Calculadora;

public class Calc {

	private int num = 0;
	private double[] vect = new double[num];
	private double soma =0;
	
	public Calc() {
		
	}

	public int Calc(int num) {
		return this.num = num;
	}

	public int setNum() {
		return num;
	}
	
	public double getSoma() {
		return this.soma;
	}

	public double setVect(int n, double x) {
		return this.vect[n] = x;
	}

	public double Soma(int x, double y) {
		
		this.soma = this.soma + vect[x];
		
		
		return this.soma;
	}

}
