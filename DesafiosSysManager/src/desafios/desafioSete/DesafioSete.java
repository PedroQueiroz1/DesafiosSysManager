package desafios.desafioSete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafios.desafioSete.conversor.ConversorFloat;
import desafios.desafioSete.entidade.Aluno;
import desafios.desafioSete.util.Sistema;

public class DesafioSete {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		float mediaTurma = 0;
		float maiorMedia = 0;
		// Não é o ideal \/
		float menorMedia = 0;
		
		
		System.out.println("Digite a quantidade de alunos na turma.");
		int qtdAlunos = scanner.nextInt();
		scanner.nextLine();
		
		
		for(int i = 1; i<=qtdAlunos; i++) {
		
			System.out.println("Digite o nome do aluno [" + i + "]");
			String nome = scanner.nextLine();
			
			System.out.println("Digite a primeira nota do aluno [" + i + "]");
			String nota1 = scanner.next();
			
			System.out.println("Digite a segunda nota do aluno [" + i + "]");
			String nota2 = scanner.next();
			scanner.nextLine();
			
			//Converte para float de até duas casas decimais
			float nota1Convertida = ConversorFloat.parseFloat(nota1);
			float nota2Convertida = ConversorFloat.parseFloat(nota2);
			
			// * *
			float mediaAluno = Sistema.calcularMedia(nota1Convertida, nota2Convertida);
			
			String situacao = Sistema.verificarSituacao(mediaAluno);
			
			//Imprime se o aluno foi aprovado ou reprovado
			System.out.println("\nO aluno " + nome + " foi " + situacao + "\n");
			
			//Calcula média da turma
			mediaTurma += mediaAluno;
			
			//Calcula maior média
			if(mediaAluno > maiorMedia) {maiorMedia = mediaAluno;}
			
			//Calcula menor media
			if(i == 1) {
				menorMedia = mediaAluno;
			}else if(mediaAluno < menorMedia) {
				menorMedia = mediaAluno;
			} else {
				System.out.println("Erro");
			}
			
			Aluno aluno = new Aluno(nome, nota1Convertida, nota2Convertida, situacao);
			alunos.add(aluno);
				
			mediaTurma /= i;
		}
		
		float mediaTurmaConvertida = ConversorFloat.parseFloat(Float.toString(mediaTurma));
		
		System.out.println("Média da turma: " + mediaTurmaConvertida);
		System.out.println("Maior média " + maiorMedia);
		System.out.println("Menor média " + menorMedia);
	
		scanner.close();
	}
	
}
