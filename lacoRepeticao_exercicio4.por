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
