package Aula4;

public class AlunoSup extends AlunoTec {
	double n4;
	double freq;
	
	
	void calcMedia() {
		media = (n1 + n2 + n3 + n4)/4.0;
		freq = media/100;
		if(media>5.9 && freq > 75) {
			Status = "Aluno aprovado";
		} else if(media > 4.0 && media < 5.9 && freq > 75){
			Status = "Aluno em Recuperação";
		} else {
			Status = "Aluno reprovado";
		}
	}
}