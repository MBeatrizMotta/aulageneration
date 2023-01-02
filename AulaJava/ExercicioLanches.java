package Atividade1;

import java.util.Scanner;

public class ExercicioLanches {

	public static void main(String[] args) {
        int cod, qtde;
        Scanner leia = new Scanner(System.in);
        
		System.out.print("Código do Produto: ");
		cod = leia.nextInt();
		
		System.out.print("Quantidade: ");
		qtde= leia.nextInt();

		if(cod == 1) {
			System.out.print("Produto: Cachorro-quente\n");
			System.out.print("Valor total: R$ " + qtde*10.0);
		}
		else if(cod == 2 ){
			System.out.print("Produto: X-Salada\n");
			System.out.print("Valor total: R$ " + qtde*15.0);
		}
		else if(cod == 3) {
			System.out.print("Produto: X-Bacon\n");
			System.out.print("Valor total: R$ " + qtde*18.0);
			
		}
		else if(cod == 4){
			System.out.print("Produto: Bauru\n");
			System.out.print("Valor total: R$ " + qtde*12.0);
		}
		else if(cod == 5){
			System.out.print("Produto: Refrigerante\n");
			System.out.print("Valor total: R$ " + qtde*8.0);
		}
		else if(cod == 6){
			System.out.print("Produto: Suco de laranja\n");
			System.out.print("Valor total: R$ " + qtde*13.0);
		}
		else {
			System.out.print("Produto invalido");
		}
	}

}
