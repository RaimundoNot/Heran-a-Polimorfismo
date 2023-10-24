package Aula4;

public class AlunoTec extends Aluno{
	double n3;
	
	void calcMedia() {
		media = (n1 + n2 + n3)/3.0;
		if(media>=5) {
			Status = "Aluno aprovado";
		} else if(media > 4.0 && media < 4.9){
			Status = "Aluno em Recuperação";
		} else {
			Status = "Aluno reprovado";
		}
	}
}