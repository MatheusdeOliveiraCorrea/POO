package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
		
	private String nome;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola; 
	private String serieMatriculado;
	private int idade; 
	private double media; 
	
	
	
	
	public double getMedia() {
		
		double somaNotas = 0;
		
		for(Disciplina disciplina: disciplinas) {
			
			somaNotas += disciplina.getNota();
			
		}
		
		return somaNotas / disciplinas.size(); 
	}


	public void setMedia(int media) {
		this.media = media;
	}



	private List<Disciplina> disciplinas  = new ArrayList();
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getRegistroGeral() {
		return registroGeral;
	}


	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}



	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}



	public String getNomeMae() {
		return nomeMae;
	}


	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}



	public String getNomePai() {
		return nomePai;
	}


	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}



	public String getDataMatricula() {
		return dataMatricula;
	}


	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}


	public String getNomeEscola() {
		return nomeEscola;
	}



	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}


	public String getSerieMatriculado() {
		return serieMatriculado;
	}



	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}



	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral
				+ ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula="
				+ dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", idade="
				+ idade + ", disciplinas=" + disciplinas + "]";
	} 
	
	
	
	
}
