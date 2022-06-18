package br.com.aula.atividades;

import java.util.Scanner;

public class Atividade3 {

	// Colete a quantidade de alunos de uma turma
	// Colete o nome de cada um
	// Colete a média do aluno para cada trimestre de cada matéria, ou seja 4 notas
	// para cada materia, para cada um dos 4 periodos do ano
	// As materias podem estar fixa no código fonte, não precisa seguir um padrão de
	// quantidade de materias e nomes especificos para cada uma delas

	// Diga se o aluno está aprovado, reprovado ou em recuperação
	// Como funciona nossa metrica
	// Aprovado média 7
	// Recuperação média >= 6,25
	// Reprovado < 6,25

	// Você deve usar concatenação, variáveis String, int e double
	// deve usar if, swtich, array e looping for

	// concluindo a atividade subir ela para seu repositório do Git
	// cada Aluno poderá ter seu código analisado em uma call privada depois da aula
	// (de forma randon)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de alunos:");
		int numAlunos = sc.nextInt();

		String[] alunosLista = new String[numAlunos];

		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Escreva o nome do aluno ");
			alunosLista[i] = sc.next();
		}

		double[] primeiroTrimestre = new double[4];
		double[] segundoTrimestre = new double[4];
		double[] terceiroTrimestre = new double[4];
		double[] media = new double[4];

		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Agora informe as notas do aluno " + alunosLista[i] + " referente ao primeiro trimestre:");
			System.out.println("Nota da materia de Pocoes");
			double n1 = sc.nextDouble();
			System.out.println("Nota da materia de Defesa contra a arte das Trevas");
			double n2 = sc.nextDouble();
			System.out.println("Nota da materia de Transfiguracao");
			double n3 = sc.nextDouble();
			System.out.println("Nota da materia de Adivinhacao");
			double n4 = sc.nextDouble();
			primeiroTrimestre[i] = (n1 + n2 + n3 + n4) / 4;

			System.out.println("Agora informe as notas do aluno " + alunosLista[i] + " referente ao segundo trimestre:");
			System.out.println("Nota da materia de Pocoes");
			double n5 = sc.nextDouble();
			System.out.println("Nota da materia de Defesa contra a arte das Trevas");
			double n6 = sc.nextDouble();
			System.out.println("Nota da materia de Transfiguracao");
			double n7 = sc.nextDouble();
			System.out.println("Nota da materia de Adivinhacao");
			double n8 = sc.nextDouble();
			segundoTrimestre[i] = (n5 + n6 + n7 + n8) / 4;

			System.out.println("Agora informe as notas do aluno " + alunosLista[i] + " referente ao terceiro trimestre:");
			System.out.println("Nota da materia de Pocoes");
			double n9 = sc.nextDouble();
			System.out.println("Nota da materia de Defesa contra a arte das Trevas");
			double n10 = sc.nextDouble();
			System.out.println("Nota da materia de Transfiguracao");
			double n11 = sc.nextDouble();
			System.out.println("Nota da materia de Adivinhacao");
			double n12 = sc.nextDouble();
			terceiroTrimestre[i] = (n9 + n10 + n11 + n12) / 4;

			media[i] = (primeiroTrimestre[i] + segundoTrimestre[i] + terceiroTrimestre[i]) / 3;

		}

		for (int i = 0; i < numAlunos; i++) {

			if (media[i] < 6.25) {
				System.out.println("O aluno " + alunosLista[i] + " teve a media das materias igual a: " + media[i]
						+ ". Portanto esta reprovado!");
			} else if (media[i] > 7) {
				System.out.println("O aluno " + alunosLista[i] + " teve a media das materias igual a: " + media[i]
						+ ". Portanto esta aprovado!");
			} else
				System.out.println("O aluno " + alunosLista[i] + " teve a media das materias igual a: " + media[i]
						+ ". Portanto esta em recuperacao!");
		}

	}
}