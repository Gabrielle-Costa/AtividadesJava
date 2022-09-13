package entities;

import java.util.Date;
import java.util.Objects;

public class Usuario {
	
	private String nome;
	private Date dtAcesso;
	
	public Usuario(String nome, Date dtAcesso) {
		super();
		this.nome = nome;
		this.dtAcesso = dtAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtAcesso() {
		return dtAcesso;
	}

	public void setDtAcesso(Date dtAcesso) {
		this.dtAcesso = dtAcesso;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}

	

	

}
