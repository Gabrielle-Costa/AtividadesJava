package entities;

import java.util.Objects;

public class Aluno {
	
	private int codAluno;

	public Aluno(int codAluno) {
		super();
		this.codAluno = codAluno;
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codAluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return codAluno == other.codAluno;
	}
	
	

}
