package Funcionario;

public class Cadastro {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Cadastro() {
		
	}
	
	public Cadastro (Integer id , String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public double aumentoSal(double percent) {
		
		this.salario = this.salario + (this.salario * (percent / 100.00));
		return this.salario;
	}
	
	public String toString() {
		
		return id
				+ ", "
				+ nome
				+ ", "
				+ String.format("%.2f%n", salario);
	}
	
	

}
