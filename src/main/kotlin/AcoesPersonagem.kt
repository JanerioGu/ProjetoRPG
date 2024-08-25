package org.example

import kotlin.random.Random

class AcoesPersonagem(val personagem: CriacaoPersonagem) {
    fun atacar() {
        val dado = Random.nextInt(1, 7)
        val totalForca = personagem.atributos.forca + personagem.atributosModificadores.forca
        val hit = dado + totalForca
        if (hit > 0) {
            println("Acertou! Você deu $hit de dano")
        }
    }
}
