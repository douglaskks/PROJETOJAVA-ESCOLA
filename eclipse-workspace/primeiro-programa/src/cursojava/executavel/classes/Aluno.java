package cursojava.executavel.classes;

public class Aluno {

		public String nomeCompleto;
		int idade;
		String dataNascimneto;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String serieMatriculado;
		
		
		public Aluno() {/*Cria os dados na memória - (padrão)*/
		
				
		}
		
		public Aluno(String nomePadrao) {
			
			
		}
		
		public Aluno(String nomePadrao, int idadePadrao) {
			
				nomeCompleto = nomePadrao;
				idade = idadePadrao;
		}
}
