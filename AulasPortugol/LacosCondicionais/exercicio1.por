programa {
  funcao inicio() {
    inteiro num

    escreva("Digite um numero: ")
    leia(num)

    escreva("O N�mero " + num + " � ")

    se(num % 2 == 0)
      escreva("par")
    senao
      escreva("impar")

    escreva(" e ")

    se(num > 0)
      escreva("positivo")
    senao
      escreva("negativo")
  }
}
