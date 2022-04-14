package classes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   Aluno aluno = new Aluno();
	   //pergunta
	   String nota1 = JOptionPane.showInputDialog("nota 1: ");
	   String nota2 = JOptionPane.showInputDialog("nota 2: ");
	   String nota3 = JOptionPane.showInputDialog("nota 3: ");
	   String nota4 = JOptionPane.showInputDialog("nota 4: ");
	   
	   //responde
	   aluno.setNota1(Integer.parseInt(nota1));
	   aluno.setNota2(Integer.parseInt(nota2));
	   aluno.setNota3(Integer.parseInt(nota3));
	   aluno.setNota4(Integer.parseInt(nota4));
	   aluno.setAnoInicial(2022);
	   aluno.setAnoFinal(2024);
	   
	  /* 
	   * //mostra na tela
	   System.out.println("Media : " + aluno.getMedia());
	   System.out.println("Aprovado? " + aluno.Aprovado());
	   System.out.println("Duracao curso : " + aluno.duracaoCurso());
	   */


	   //mostra na tela
	   System.out.println(aluno);
	   
	   
	}

}
