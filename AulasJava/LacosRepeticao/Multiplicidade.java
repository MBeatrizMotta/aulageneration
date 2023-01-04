package Atividade2;

import java.util.Scanner;

public class Multiplicidade {

	public static void main(String[] args) {
		int num, cont = 0;
	    float soma = 0.0f;
	    Scanner leia = new Scanner(System.in);
	    
	    do{
	      System.out.println("Digite um número: ");
	      num = leia.nextInt();

	      if(num != 0 && num % 3 == 0) {
	        soma = soma + num;
	        cont++;
	      }      
	    }
	    while(num != 0);

	    System.out.println("A média de todos os números múltiplos de 3 é: " + soma/cont);

	}

}
