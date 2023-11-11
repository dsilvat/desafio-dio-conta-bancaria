package contabanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		double saldo;
		String agencia;
		String nomeCliente;

		System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: ");
		numero = sc.nextInt();

		System.out.println("Agora digite o número da Agência: ");
		agencia = sc.next();

		System.out.println("Digite seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Digite seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();
	}

}