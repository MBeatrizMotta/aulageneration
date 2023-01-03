programa {
  funcao inicio() {
    inteiro v[10], aux, i, j

    para(i = 0; i < 10; i++) {
      escreva("v["+i+"]: ")
      leia(v[i])
    }

    para(j = 1; j < 10; j++) {
      para(i = 0; i < 9; i++) {
        se(v[i] < v[i+1]) {
          aux = v[i]
          v[i] = v[i+1]
          v[i+1] = aux
        }
      }
    }

    para(i = 0; i < 10; i++) {
      escreva("" + v[i] + " | ")
    }
  }
}
*****************************************************
programa {
  funcao inicio() {
    inteiro m[3][3], i, j, somaPrinc = 0, somaSec = 0

    para(i = 0; i < 3; i++) {
      para(j = 0; j < 3; j++) {
        escreva("m["+i+"]["+j+"]: ")
        leia(m[i][j])
      }
    }

    escreva("\nElementos da Diagonal Principal:\n")

    para(i = 0; i < 3; i++) {
      para(j = 0; j < 3; j++) {
        se(i == j) {
          escreva("" + m[i][j] + " ")
          somaPrinc += m[i][j]
        }
      }
    }

    escreva("\n\nElementos da Diagonal Secundaria:\n")

    para(i = 0; i < 3; i++) {
      para(j = 0; j < 3; j++) {
        se(i + j ==2) {
          escreva("" + m[i][j] + " ")
          somaSec += m[i][j]
        }
      }
    }

    escreva("\n\nSoma dos Elementos da Diagonal Principal:\n" + somaPrinc)

    escreva("\n\nSoma dos Elementos da Diagonal Secundaria:\n" + somaSec)
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */