package Atividade2;

import java.util.Scanner;

public class ParIdade {

	public static void main(String[] args) {
		int i, num, contPar = 0, contImpar = 0;
		Scanner leia = new Scanner(System.in);
			    
	    for(i = 1; i <= 10; i++) {
	      System.out.println("Digite o " + i + "º número: ");
	      num = leia.nextInt();

	      if(num % 2 ==0)
	        contPar++;
	      else
	        contImpar++;
	    }

	    System.out.println("\nTotal de números pares: " + contPar + "\n");
	    System.out.println("Total de números ímpares: " + contImpar);

	}

}
