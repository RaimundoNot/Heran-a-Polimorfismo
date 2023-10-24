package Aula4;

public class Teste {

	public static void main(String[] args) {
		
		Aluno al = new Aluno();
		
		al.name = "Jõao";
		al.n1 = 5.0;
		al.n2 = 3.2;
		
		al.calcMedia();
		
		System.out.println("Aluno: "+al.name);
		System.out.printf("Média: %.1f%n",al.media);
		System.out.println(al.Status);
		
		AlunoTec alTec = new AlunoTec();
		
		alTec.name = "Francisco";
		alTec.n1 = 8.0;
		alTec.n2 = 3.2;
		alTec.n3 = 2.9;
		
		alTec.calcMedia();
		
		System.out.println("Aluno Tecnico: "+alTec.name);
		System.out.printf("Média do Aluno Tecnico: %.1f%n",alTec.media);
		System.out.println(alTec.Status);
		
		AlunoSup alSup = new AlunoSup();
		
		alSup.name = "James";
		alSup.n1 = 6.0;
		alSup.n2 = 7.5;
		alSup.n3 = 2.2;
		
		alSup.calcMedia();
		
		System.out.println("Aluno Superior: "+alSup.name);
		System.out.printf("Média do Aluno Superior: %.1f%n",alSup.media);
		System.out.printf("Frequencia do Aluno Superior: %.1f%%%n",alSup.freq);
		System.out.println(alSup.Status);
	}

}
