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
