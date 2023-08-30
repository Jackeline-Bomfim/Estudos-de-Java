package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		System.out.println(alunos);
		
		System.out.println("---------------------------------------------------------------");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println(alunos.size());
		
		System.out.println("---------------------------------------------------------------");
		
		
	}
}
