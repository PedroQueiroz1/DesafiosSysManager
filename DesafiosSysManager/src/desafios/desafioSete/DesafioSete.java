package desafios.desafioSete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafios.desafioSete.entidade.Aluno;
import desafios.desafioSete.util.Sistema;

public class DesafioSete {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		float mediaTurma = 0;
		float maiorMedia = 0;
		float menorMedia = 0;
		
		
		System.out.println("Digite a quantidade de alunos na turma.");
		int qtdAlunos = scanner.nextInt();
		scanner.nextLine();
		
		
		for(int i = 1; i<=qtdAlunos; i++) {
			System.out.println("Digite o nome do aluno [" + i + "]");
			String nome = scanner.nextLine();
			
			System.out.println("Digite a primeira nota do aluno [" + i + "]");
			float nota1 = scanner.nextFloat();
			
			System.out.println("Digite a segunda nota do aluno [" + i + "]");
			float nota2 = scanner.nextFloat();
			scanner.nextLine();
			
			float mediaAluno = Sistema.calcularMedia(nota1, nota2);
			
			String situacao = Sistema.verificarSituacao(mediaAluno);
			
			//Imprime se o aluno foi aprovado ou reprovado
			System.out.println("\nO aluno " + nome + " foi " + situacao + "\n");
			
			//Calcula média da turma
			mediaTurma += mediaAluno;
			
			//Calcula maior média
			if(mediaAluno>maiorMedia) {maiorMedia = mediaAluno;}
			
			//Calcula menor media
			menorMedia = mediaAluno;
			
			if(mediaAluno<menorMedia) {menorMedia = mediaAluno;}
			
			Aluno aluno = new Aluno(nome, nota1, nota2, situacao);
			alunos.add(aluno);
				
			mediaTurma /= i;
		}
		
		
		System.out.println("Média da turma: " + mediaTurma);
		System.out.println("Maior média " + maiorMedia);
		System.out.println("Menor média " + menorMedia);
	
		scanner.close();
	}
	
}
