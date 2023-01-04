package Atividade2;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		int idade = 0, totalMenor = 0, totalMaior = 0;
		Scanner leia = new Scanner(System.in);
		
	    while(idade >= 0) {
	      System.out.println("Digite uma idade: ");
	      idade = leia.nextInt();
	
	      if(idade > 0 && idade < 21) 
	        totalMenor++;
	
	      if(idade > 50)
	        totalMaior++;
	    }
	
	    System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenor);
	    System.out.println("\nTotal de pessoas maiores de 50 anos: " + totalMaior);
	  }
}
