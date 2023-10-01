package exercicios;

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Desafio DIO
		
		Scanner scan = new Scanner(System.in);
				
		int numero;
		String agencia;
		String nome_Cliente;
		double saldo;
				
		System.out.println("Digite o número da Agência!");
		agencia = scan.next();
				
		System.out.println("Digite o numero da conta!");
		numero = scan.nextInt();
				
		System.out.println("Digite seu nome!");
		nome_Cliente = scan.next();
				
		System.out.println("Digite seu saldo!");
		saldo = scan.nextDouble();
				
		System.out.println("Olá " + nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência \n é " + agencia + ", conta " + numero +" e seu saldo "+ saldo + " já está disponível para saque");
	}

}
