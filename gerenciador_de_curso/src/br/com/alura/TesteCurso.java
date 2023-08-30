package br.com.alura;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do JAVA", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(javaColecoes.getAulas());
		System.out.println(javaColecoes);
	}
}
