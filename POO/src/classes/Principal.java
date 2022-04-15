package classes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(); 
		
		//primeira disciplina
		Disciplina disciplina1 = new Disciplina();		
		disciplina1.setDisciplina("banco de dados");
		disciplina1.setNota(90);
		
		aluno.getDisciplinas().add(disciplina1);
		
		//segunda disciplina
	    Disciplina disciplina2 = new Disciplina(); 
		
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(80);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//terceira disciplina
		Disciplina disciplina3 = new Disciplina(); 
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(40);
		
		aluno.getDisciplinas().add(disciplina3);
		
		//quarta disciplina
		Disciplina disciplina4 = new Disciplina(); 
		disciplina4.setDisciplina("Fundamentos da computacao");
		disciplina4.setNota(40);
		
		aluno.getDisciplinas().add(disciplina4);
		
		
		
		System.out.println(aluno.getDisciplinas());
		

	}

}
