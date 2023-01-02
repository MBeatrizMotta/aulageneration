package Atividade1;

import java.util.Scanner;

public class ExercicioImparPar {

	public static void main(String[] args) {

		int numero;
		Scanner leia = new Scanner(System.in);
		
   		System.out.println("\nDigite um número: ");
   		numero = leia.nextInt();
   		
   		if (numero % 2 == 0)
   		{
   			System.out.print("\nEsse número é par");
  	
   		}
   		else
   		{
   			System.out.print("\nEsse número é impar");
   		}

   		if (numero > 0)
   		{
   			System.out.println(" e positivo");
   		}
   		else
		{ 
			System.out.println(" e negativo");
		}
	}

}
