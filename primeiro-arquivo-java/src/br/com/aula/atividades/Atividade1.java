package br.com.aula.atividades;

import java.util.Scanner;

public class Atividade1 {
	
	//colete o nome do usuário
	//colete a idade de usuário
	//faça o sistema dizer "<nome_usuario>, menores de idade nao são permitidos"
	//faça o sistema dizer "<nome_usuario> Seja Bem Vindo!"
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		
		System.out.println("Digite sua idade:");
		int age = sc.nextInt();
		
		
		if(age < 18) {
			System.out.println(nome + ", menores de idade nao sao permitidos");
		} else { 
			System.out.println(nome + ". Seja bem Vindo!");
	}
	}
}
