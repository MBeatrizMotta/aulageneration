programa {
  funcao inicio() {
    inteiro idade

    escreva("Digite a idade: ")
    leia(idade)

    se(idade < 16)
      escreva("A pessoa n�o est� apta a votar.")

    senao se(idade >= 16 e idade < 18)
      escreva("A pessoa est� apta a votar e o voto � facultativo.")

    senao se(idade >= 18 e idade < 65)
      escreva("A pessoa est� apta a votar e o voto � obrigat�rio.")

    senao
      escreva("A pessoa est� apta a votar e o voto � facultativo.")
  }
}
