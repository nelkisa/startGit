package calculadora;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		int opcao;
		
		System.out.println("Escolha uma opção abaixo:\n"
				+ "1. Soma\n"
				+ "2. Subtração\n"
				+ "3. Multiplicação\n"
				+ "4. Divisão");
		opcao = sc.nextInt();
		
		if (opcao > 0 && opcao < 5){
			System.out.println("Insira o primeiro valor: ");
			n1 = sc.nextDouble();
			System.out.println("Insira o segundo valor: ");
			n2 = sc.nextDouble();
			
			switch (opcao) {
			case 1:
				System.out.println("Soma: "+(n1+n2));		
							
				break;
			case 2:
				System.out.println("Subtração: "+(n1-n2));		
							
				break;

			case 3:
				System.out.println("Multiplicação: "+(n1*n2));		
							
				break;

			case 4:
				System.out.println("Divisão: "+(n1/n2));		
							
				break;

			default:
				break;
			}

		}	
		else {
			System.out.println("Valor inválido!");
		}
		
	}

}
