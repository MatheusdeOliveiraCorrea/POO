package classes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		/*
		 * //perguntas 
		 * String nome = JOptionPane.showInputDialog("Qual seu seu nome?");
		 * aluno.setNome(nome); String nascimento =
		 * JOptionPane.showInputDialog("data de nascimento: ");
		 * aluno.setDataNascimento(nascimento); String rg =
		 * JOptionPane.showInputDialog("Qual seu RG?"); aluno.setRegistroGeral(rg);
		 * String cpf = JOptionPane.showInputDialog("Qual seu cpf? ");
		 * aluno.setNumeroCPF(cpf); String mae =
		 * JOptionPane.showInputDialog("Qual nome da sua mãe? "); aluno.setNomeMae(mae);
		 * String pai = JOptionPane.showInputDialog("Qual nome do seu pai? ");
		 * aluno.setNomePai(pai); String escola =
		 * JOptionPane.showInputDialog("Qual sua escola? ");
		 * aluno.setNomeEscola(escola); String datamatricula =
		 * JOptionPane.showInputDialog("Quando vc se matriculou?  ");
		 * aluno.setDataMatricula(datamatricula);
		 * 
		 */

		for (int pos = 1; pos <= 4; pos++) {

			String nomeDisc = JOptionPane.showInputDialog("nome da disciplina " + pos + " ?");
			String notaDisc = JOptionPane.showInputDialog("Qual nota da disciplina " + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisc);
			disciplina.setNota(Double.valueOf(notaDisc));

			aluno.getDisciplinas().add(disciplina);

		}
		
		
		
		
		int remover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(remover == 0) {
			String index = JOptionPane.showInputDialog("Qual disciplina? (1,2,3,4)");
			aluno.getDisciplinas().remove(Integer.parseInt(index) - 1);
			
			JOptionPane.showMessageDialog(null, "Disciplina "+ index +" removida com sucesso ");
			
		}
		
	//	System.out.println("O aluno esta aprovado?  " + (aluno.isAprovado()?"Aprovado":"Reprovado"));

		
		// Beschreibung
		System.out.println(aluno);
		

	}

}
