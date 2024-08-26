package view;

import java.util.Scanner; //Importando o scanner de entrada

public class Lab01Sistema {
	public static void main(String[] args) {
		int opcao = 0; // variavel opcao que recebe 0 como inicio
		while (opcao != 9) {
			Scanner leia = new Scanner(System.in); //criando uma variavel leia que recebe o comando de leitura scanner
			System.out.println("1 - Cadastramento");  //comando de saida
			System.out.println("2 - Saque");
			System.out.println("3 - Depósito");
			System.out.println("Fim");
			System.out.println("Digite sua opção: ");
			opcao = leia.nextInt(); // opcao recebe a variavel de entrada leia
			switch (opcao) {
			case 1:
				execCadastramento();
				break;
			case 2:
				execSaque();
				break;
			case 3:
				execDeposito();
				break;
			default:
				break;
			}
		}
	}
	
	public static void execCadastramento() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Numero da Agencia: ");
		int agencia = leia.nextInt();
		System.out.println("Digite o Numero da Conta: ");
		int conta = leia.nextInt();
		System.out.println("Digite o Nome do Cliente: ");
		String nome = leia.next();
		System.out.println("Digite o Saldo ");
		double saldo = leia.nextDouble();
		System.out.println("Confirma cadastramento (S/N): ");
		String cad = leia.next();
		if (cad.equalsIgnoreCase("s")) {
			System.out.println("Cadastro realizado com sucesso!");
		}
	}


	public static void execSaque() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Numero da Agencia: ");
		int agencia = leia.nextInt();
		System.out.println("Digite o Numero da Conta: ");
		int conta = leia.nextInt();
		System.out.println("Digite o Nome do Cliente: ");
		String nome = leia.next();
		System.out.println("Digite o valor do saque: ");
		double saldo = leia.nextDouble();
		System.out.println("Confirma saque (S/N): ");
		String saq = leia.next();
		if (saq.equalsIgnoreCase("s")) {
			System.out.println("Saque realizado com sucesso!");
		}
	}
	
	public static void execDeposito() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Numero da Agencia: ");
		int agencia = leia.nextInt();
		System.out.println("Digite o Numero da Conta: ");
		int conta = leia.nextInt();
		System.out.println("Digite o Nome do Cliente: ");
		String nome = leia.next();
		System.out.println("Digite o valor de depósito: ");
		double saldo = leia.nextDouble();
		System.out.println("Confirma deposito(S/N): ");
		String dep = leia.next();
		if (dep.equalsIgnoreCase("s")) {
			System.out.println("Saque realizado com sucesso!");
		}
	}
}
