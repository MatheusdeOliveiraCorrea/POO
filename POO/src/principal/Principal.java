package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classes.AcessKlasse;
import classes.Aluno;
import classes.Diretor;
import classes.Disciplina;
import constantes.StatusAluno;

public class Principal {

	public static void main(String[] args) {
		try {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha:");

		if (new AcessKlasse(new Diretor(login, senha)).autenticar()) { // VALIDAÇÃO SENHA

			List<Aluno> alunos = new ArrayList<Aluno>(); // Lista de alunos

			// Gerencia lista de Alunos, adcionando cada novo aluno a lista "alunos"
			for (int cont = 1; cont <= 3; cont++) {

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
				 * Adcionando ao Aluno 'x quantidade de' disciplinas sendo pos o contador da
				 * quantidade desejada de disciplinas. A fim de criar uma Disciplina (objeto)
				 * precisa de um nome e de uma nota, tais informações são obtidas a partir de
				 * dois JPanels para cada pergunta. Em seguida atribui-se ao objeto "disciplina"
				 * e o ADCIONA a LISTA <Disciplina> dentro de Aluno...
				 */
				for (int pos = 1; pos <= 1; pos++) { // esse contador controla a quantidade de disciplinas

					Disciplina disciplina = new Disciplina();

					String nomeDisc = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
					String notaDisc = JOptionPane.showInputDialog("Qual nota da disciplina " + pos + " ?");

					disciplina.setDisciplina(nomeDisc); // atribuindo o nome
					//disciplina.setNota(Double.valueOf(notaDisc)); // e a nota ao objeto

					aluno.getDisciplinas().add(disciplina);

				}

				// Caso o usuário necessite remover alguma disciplina da lista, dentro da classe
				// Aluno,
				// "disciplinas"
				int remover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (remover == 0) { // Caso sim 

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

			// listas para cada alunosstatus (aprovado ou reprovado)
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>()); // lista aprovados
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>()); // lista reprovados
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>()); // lista recuperacao

			for (Aluno aluno : alunos) {

				// condições para saber quem tá reprovado, recuperacao ou aprovado

				if (aluno.getAprovado().equals(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno); // adciona à lista com chave "aprovado"
				}

				if (aluno.getAprovado().equals(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno); // adciona à lista com chave "recuperacao"
				}

				if (aluno.getAprovado().equals(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno); // adciona à lista com chave "reprovado"
				}

			} // fim do for para preencher as listas de REPROVADOS, RECUPERACAO e APROVADOS

			/*------------Quem Passou?------------*/
			System.out.println("---Alunos que passaram: ---");
			if (maps.get(StatusAluno.APROVADO).isEmpty()) {
				System.out.println("0");
			} else {
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {

					System.out.println(aluno.getNome() + " " + aluno.getDisciplinas());

				}
			}

			/*------------Quem Recuperacao?------------*/
			System.out.println("---Alunos que estao em recuperacao: ---");
			if (maps.get(StatusAluno.RECUPERACAO).isEmpty()) {
				System.out.println("0");
			} else {
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {

					System.out.println(aluno.getNome());

				}
			}

			/*------------Quem Reprovou?------------*/

			System.out.println("---REPROVADOS: ---");
			if (maps.get(StatusAluno.REPROVADO).isEmpty()) {
				System.out.println("0");
			} else {
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {

					System.out.println(aluno.getNome());

				}
			}

			/*
			 * // Beschreibung for (Aluno alunoforeach : alunos) {
			 * 
			 * System.out.println(alunoforeach.getNome()); System.out.println("Media: " +
			 * alunoforeach.getMedia()); System.out.println("Situacao: " +
			 * alunoforeach.getAprovado() + "\n"); System.out.println(
			 * "-----------------------------------------------------------" +
			 * "--------------------------------------------------------------------");
			 * 
			 * }
			 * 
			 */

		} else {
			JOptionPane.showMessageDialog(null, "SENHA INVÁLIDA, TENTE NOVAMENTE");
		}
	}catch (Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Erro no processamento de notas");
	}
		
		
	}
}
