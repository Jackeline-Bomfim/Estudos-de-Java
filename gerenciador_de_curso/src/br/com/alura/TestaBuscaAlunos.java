package br.com.alura;

public class TestaBuscaAlunos {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");


        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        
        Aluno a1 = new Aluno("Maria Eduarda Santos", 54872);
        Aluno a2 = new Aluno("Vanessa Rosa", 56897);
        Aluno a3 = new Aluno("Jackeline Bomfim", 54847);
        
        javaColecoes.matriculaAluno(a1);
        javaColecoes.matriculaAluno(a2);
        javaColecoes.matriculaAluno(a3);
        
        System.out.println("Quem é o aluno com matricula 56897?");
        Aluno aluno = javaColecoes.buscaMatriculado(5687);
        System.out.println("Aluno: " + aluno);
	}

}
