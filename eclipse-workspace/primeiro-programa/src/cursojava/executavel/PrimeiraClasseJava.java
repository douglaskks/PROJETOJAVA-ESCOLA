package cursojava.executavel;

import cursojava.executavel.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
			aluno1.nomeCompleto = "Douglas Henrique";
			System.out.println("O nome do aluno(a) 1 � " + aluno1.nomeCompleto);
		Aluno aluno2 = new Aluno();
			aluno2.nomeCompleto = "Eduarda Silva";
			System.out.println("O nome do aluno(a) 2 � " + aluno2.nomeCompleto);
		Aluno aluno3 = new Aluno();
			aluno3.nomeCompleto = "Luiz Souza";
			System.out.println("O nome do aluno(a) 3 � " + aluno3.nomeCompleto);
		Aluno aluno4 = new Aluno();
			aluno4.nomeCompleto = "Tiago Silva";
			System.out.println("O nome do aluno(a) 4 � " + aluno4.nomeCompleto);
	}
}