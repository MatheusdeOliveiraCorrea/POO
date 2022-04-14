package classes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   Aluno aluno = new Aluno();
	   
	   aluno.setNota1(70);
	   aluno.setNota2(60);
	   aluno.setNota3(50);
	   aluno.setNota4(60);
	   aluno.setAnoInicial(2022);
	   aluno.setAnoFinal(2024);
	   
	   System.out.println("Duração do curso: " + aluno.duracaoCurso());
	   
	   
	   
	}

}
