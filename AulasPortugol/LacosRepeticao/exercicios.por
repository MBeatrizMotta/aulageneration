programa {
  funcao inicio() {
    inteiro i, num, contPar = 0, contImpar = 0
    
    para(i = 1; i <= 10; i++) {
      escreva("Digite o " + i + "º número: ")
      leia(num)

      se (num % 2 ==0)
        contPar++
      senao
        contImpar++
    }

    escreva("\nTotal de números pares: " + contPar + "\n")
    escreva("Total de números ímpares: " + contImpar)
  }
}
//************************************************************
programa {
  funcao inicio() {
    inteiro idade = 0, totalMenor = 0, totalMaior = 0

    enquanto(idade >= 0) {
      escreva("Digite uma idade: ")
      leia(idade)

      se(idade > 0 e idade < 21) 
        totalMenor++

      se(idade > 50)
        totalMaior++
    }

    escreva("\nTotal de pessoas menores de 21 anos: " + totalMenor)
    escreva("\nTotal de pessoas maiores de 50 anos: " + totalMaior)
  }
}
//************************************************************
programa {
  funcao inicio() {
    inteiro num, soma = 0, cont = 0
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
//************************************************************
programa {
  funcao inicio() {
    inteiro num, soma = 0, cont = 0
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
 * @POSICAO-CURSOR = 1685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */