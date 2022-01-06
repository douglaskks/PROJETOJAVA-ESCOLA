package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.executavel.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		String numeroAluno = JOptionPane.showInputDialog("Digite qual o aluno (entre 1 e 5) deseja datalhar. ");
		int numeroAluno2 = Integer.parseInt(numeroAluno);
		
		switch(numeroAluno2) {
		
		case 1:
		Aluno aluno1 = new Aluno();
			aluno1.setNome("Emanuelly Marcela Cardoso");
			aluno1.setIdade(28);
			aluno1.setNumeroCpf("300.847.596-58");
			aluno1.setDataNascimneto("04/01/1945");
			aluno1.setNomeMae("Francisca Ester Benedita");
			aluno1.setNomePai("Samuel Yuri Severino Cardoso");
			aluno1.setRegistroGeral("16.205.122");
			aluno1.setSerieMatriculado("000000001");
			
			String resposta = JOptionPane.showConfirmDialog("Deseja calcular a nota desse aluno?");
			String resposta1 = resposta;
			int resposta2 = Integer.parseInt(resposta1);
			if (resposta1 == 0) {
				media = (JOptionPane.showInputDialog("Digite a primeira nota do aluno"));
			}
			
			System.out.println("Aluno(a): " + aluno1.getNome());
			System.out.println("Idade:  " + aluno1.getIdade());
			System.out.println("CPF: " + aluno1.getNumeroCpf());
			System.out.println("Data de Nascimento: " + aluno1.getDataNascimneto());
			System.out.println("Nome da Mãe: " + aluno1.getNomeMae());
			System.out.println("Nome do Pai: " + aluno1.getNomePai());
			System.out.println("Registro Geral: " + aluno1.getRegistroGeral());
			System.out.println("Número da Matrícula: " + aluno1.getSerieMatriculado());
		/*============================================================================================*/	
		case 2:
		Aluno aluno2 = new Aluno();
		case 3:
		Aluno aluno3 = new Aluno();
		case 4:
		Aluno aluno4 = new Aluno();
		case 5:
		Aluno aluno5 = new Aluno();
		}
	}
}