package br.com.alura;

public class Aluno {

	private String nome;
	private int numMatricula;
	
	
	public Aluno(String nome, int numMatricula) {	
		
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo.");
		}
		this.nome = nome;
		this.numMatricula = numMatricula;
	}


	public String getNome() {
		return nome;
	}


	public int getNumMatricula() {
		return numMatricula;
	}
	
	@Override
	public String toString() {		
		return "[Aluno: " + this.nome + ", Matrícula: " + this.numMatricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {		
		return this.nome.hashCode();
	}
	
	
}
