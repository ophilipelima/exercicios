package exercicios;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele. Em seguida, através de um laço for, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
		//Por fim, o programa mostra a média, aritmética, da turma.
		
		Scanner scan = new Scanner(System.in);
		
		int numeroDeAlunos;
		double nota;
		double somaDasNotas = 0;
		double mediaDaTurma;
		
		System.out.println("Quantos alunos tem na sua sala?");
		numeroDeAlunos = scan.nextInt();
		
		for(int contador = 1; contador <= numeroDeAlunos; contador++) {
			System.out.println("Digite a nota do aluno " + contador + ":");
			nota = scan.nextDouble();
			somaDasNotas += nota;
		}
		
		mediaDaTurma = somaDasNotas / numeroDeAlunos;
		
		System.out.println("A média da turma é:" + mediaDaTurma);
		
		
	}

}
