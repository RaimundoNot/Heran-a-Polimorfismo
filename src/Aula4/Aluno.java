package Aula4;

public class Aluno {
	String name;
	double n1;
	double n2;
	double media;
	String Status;
	
	void calcMedia() {
		media = (n1 + n2)/2.0;
		if(media>=5) {
			Status = "Aluno aprovado";
		} else {
			Status = "Aluno Reprovado";
		}
	}
}
