package classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>(); // Lista de alunos

		// Gerencia lista de Alunos, adcionando cada novo aluno a lista "alunos"
		for (int cont = 1; cont <= 2; cont++) {

			Aluno aluno = new Aluno(); // Novo objeto aluno que vai carregar as informações

			// perguntas
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + cont + " ?");
			aluno.setNome(nome);
			/*
			 * String nascimento = JOptionPane.showInputDialog("data de nascimento: ");
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
			 */

			/*
			 * Adcionando ao aluno 4 disciplinas. A fim de criar uma disciplina precisa de
			 * um nome e de uma nota, tais informações são obtidas a partir de dois JPanels.
			 * Em seguida instancia-se o objeto "disciplina" e o ADCIONA ao Aluno...
			 */
			for (int pos = 1; pos <= 4; pos++) {

				Disciplina disciplina = new Disciplina();

				String nomeDisc = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisc = JOptionPane.showInputDialog("Qual nota da disciplina " + pos + " ?");

				disciplina.setDisciplina(nomeDisc);
				disciplina.setNota(Double.valueOf(notaDisc));

				aluno.getDisciplinas().add(disciplina);

			}

			// Caso o usuário necessite remover alguma disciplina da lista da classe Aluno
			// "disciplinas"
			int remover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (remover == 0) {

				int repetirPergunta = 0;
				int posicao = 1;

				while (repetirPergunta == 0) {
					String index = JOptionPane.showInputDialog("Qual disciplina? (1,2,3,4)");
					aluno.getDisciplinas().remove(Integer.parseInt(index) - posicao);
					JOptionPane.showMessageDialog(null, "Disciplina " + index + " removida com sucesso ");
					repetirPergunta = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					posicao++;

				}

			} // fim remover

			alunos.add(aluno);

		} // fim for

		// Beschreibung
		for (Aluno alunoforeach : alunos) {

			System.out.println(alunoforeach);
			System.out.println("Media: " + alunoforeach.getMedia());
			System.out.println("Situacao: " + alunoforeach.getAprovado() + "\n");
			System.out.println("-----------------------------------------------------------"
					+ "--------------------------------------------------------------------");

		}

		
		
		
	}

}
