package entities;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String email;
	private Date dtAniv;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String email, Date dtAniv) {
		this.nome = nome;
		this.email = email;
		this.dtAniv = dtAniv;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtAniv() {
		return dtAniv;
	}

	public void setDtAniv(Date dtAniv) {
		this.dtAniv = dtAniv;
	}
	

}
