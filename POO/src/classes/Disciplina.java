package classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

	// Campos
	private double notas[] = new double[4];
	private String disciplina;

	// métodos



	public String getDisciplina() {
		return disciplina;
	}

	public double[] getNota() {
		return notas;
	}

	public void setNota(double[] nota) {
		
		
		this.notas = nota;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getMediaNotas() {
		
		double somaTotal = 0 ; 
		
		for(int i = 0; i < notas.length ; i++) {
			
			somaTotal += notas[i];
			
		}
		
		
		
		return somaTotal / notas.length;
	}
	
	@Override
	public String toString() {
		return "Disciplina [nota=" + Arrays.toString(notas) + ", disciplina=" + disciplina + "]";
	}

	

}
