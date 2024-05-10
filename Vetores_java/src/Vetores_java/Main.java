package Vetores_java;
import  java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Quantos Números você vai digitar: ");
		 N = sc.nextInt();
		 
		 double [] vet = new double [N];
		 
		 for (int i = 0; i < N; i++) {
			    System.out.println("Digite um numero");
			    vet[i] = sc.nextDouble();
			}

		 
		 System.out.println();
		 System.out.println("Numeros digitados: ");
		 for (int i = 0; i < N; i++) {
			 System.out.println(String.format("%.1f", vet [i]));
		 }
		
		sc.close();
	}

}
