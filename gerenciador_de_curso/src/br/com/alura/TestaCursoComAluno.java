package br.com.alura;

public class TestaCursoComAluno {

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
        
       System.out.println("Todos os alunos matriculados");
       javaColecoes.getAlunos().forEach(a -> {
    	   System.out.println(a);
       });
       
       System.out.println("O Aluno está matriculado: ");
       System.out.println(javaColecoes.estaMatriculado(a1));
       
       
	}
}
