package principal;

import java.util.Iterator;

import classes.Aluno;
import classes.Disciplina;

public class Test {

	public static void main(String[] args) {

		double notasJava[] = {7.4, 9.7, 9.8, 5};
		double notasLogica[] = {8.4, 6.7, 3.8, 10};

		
		Aluno aluno = new Aluno(); 	
		aluno.setNome("Matheus de Oliveira Corrêa");
		aluno.setNomeEscola("PUC-GO ");
		

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notasJava);
		
		aluno.getDisciplinas().add(disciplina);
		
		
		
		Disciplina disciplinaLogica = new Disciplina(); 
		disciplinaLogica.setDisciplina("Logica");	
		disciplinaLogica.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplinaLogica);
 
		
	}

}
