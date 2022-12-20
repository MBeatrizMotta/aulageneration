programa {
  funcao inicio() {
    inteiro num, cont = 0
    real soma = 0.0

    faca{
      escreva("Digite um número: ")
      leia(num)

      se(num != 0 e num % 3 == 0) {
        soma = soma + num
        cont++
      }      
    }
    enquanto(num != 0)

    escreva("A média de todos os números múltiplos de 3 é: " + soma/cont)
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 76; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */