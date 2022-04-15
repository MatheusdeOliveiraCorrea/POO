package classes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   Aluno aluno = new Aluno();
	   Aluno aluno2 = new Aluno();
	   
	   //pergunta
	   String disciplina1 = JOptionPane.showInputDialog("disciplina : ");
	   String nota1 = JOptionPane.showInputDialog("nota 1: ");
	   String disciplina2 = JOptionPane.showInputDialog("disciplina : ");
	   String nota2 = JOptionPane.showInputDialog("nota 2: ");
	   String disciplina3 = JOptionPane.showInputDialog("disciplina : ");
	   String nota3 = JOptionPane.showInputDialog("nota 3: ");
	   String disciplina4 = JOptionPane.showInputDialog("disciplina : ");
	   String nota4 = JOptionPane.showInputDialog("nota 4: ");
	   
	   
	   //responde
	   aluno.setNota1(Integer.parseInt(nota1));
	   aluno.setNota2(Integer.parseInt(nota2));
	   aluno.setNota3(Integer.parseInt(nota3));
	   aluno.setNota4(Integer.parseInt(nota4));
	   aluno.setDisciplina1(disciplina1);
	   aluno.setDisciplina2(disciplina2);
	   aluno.setDisciplina3(disciplina3);
	   aluno.setDisciplina4(disciplina4);
	   aluno.setAnoInicial(2022);
	   aluno.setAnoFinal(2024); 
	   
	 
	   //mostra na tela
	   System.out.println("Media : " + aluno.getMedia());
	   System.out.println("Aprovado? " + aluno.Aprovado());
	   System.out.println("Duracao curso : " + aluno.duracaoCurso());
	   


	   //mostra na tela
	   System.out.println(aluno);
	  
	   
	   
	}

}
