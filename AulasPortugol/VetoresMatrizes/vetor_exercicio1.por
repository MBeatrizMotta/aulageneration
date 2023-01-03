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