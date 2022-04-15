package classes;

import java.util.Objects;

public class Aluno {
	
	public double media; 
	private String disciplina1;
	private double nota1;
	private String disciplina2;
	private double nota2;
	private String disciplina3;
	private double nota3;
	private String disciplina4;
	private double nota4;
	private int anoInicial;
	private int anoFinal;
	private String nome;
	
	
	
	public String getDisciplina1() {
		return disciplina1;
	}


	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}


	public String getDisciplina2() {
		return disciplina2;
	}


	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}


	public String getDisciplina3() {
		return disciplina3;
	}


	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}


	public String getDisciplina4() {
		return disciplina4;
	}


	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoInicial() {
		return anoInicial;
	}


	public void setAnoInicial(int anoInicial) {
		this.anoInicial = anoInicial;
	}


	public int getAnoFinal() {
		return anoFinal;
	}


	public void setAnoFinal(int anoFinal) {
		this.anoFinal = anoFinal;
	}
	
	
	
	public double getNota1() {
		return nota1;
	}


	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}


	public double getNota2() {
		return nota2;
	}


	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}


	public double getNota3() {
		return nota3;
	}


	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}


	public double getNota4() {
		return nota4;
	}


	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	
	public double getMedia() {		
		
	   this.media = (nota1+nota2+nota3+nota4)/4;
		
		return media;   
	}
	
	
	public boolean Aprovado() {
		
		if(this.getMedia()>=70) {
			return true;
		}else {
			return false; 
		}
			 
	}
	
	public int duracaoCurso() {
		
		int anoatual = anoFinal - anoInicial; 
		
		return anoatual; 
	}


	@Override
	public String toString() {
		return "Aluno [media=" + media + ", disciplina1=" + disciplina1 + ", nota1=" + nota1 + ", disciplina2="
				+ disciplina2 + ", nota2=" + nota2 + ", disciplina3=" + disciplina3 + ", nota3=" + nota3
				+ ", disciplina4=" + disciplina4 + ", nota4=" + nota4 + ", anoInicial=" + anoInicial + ", anoFinal="
				+ anoFinal + ", nome=" + nome + "]";
	}




	
	
}
