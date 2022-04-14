package classes;

public class Aluno {
	
	public double media; 
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	public int anoInicial;
	public int anoFinal;
	
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
		
	   this.media = (nota1+nota2+nota3+nota4);
		
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
		return "Aluno [getAnoInicial()=" + getAnoInicial() + ", getAnoFinal()=" + getAnoFinal() + ", getNota1()="
				+ getNota1() + ", getNota2()=" + getNota2() + ", getNota3()=" + getNota3() + ", getNota4()="
				+ getNota4() + ", getMedia()=" + getMedia() + ", Aprovado()=" + Aprovado() + ", duracaoCurso()="
				+ duracaoCurso() + "]";
	}




	
	
}
