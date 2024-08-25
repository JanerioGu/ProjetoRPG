package org.example.Raças

import org.example.Atributos

class AnãoDaColina : Bonus {

    override fun BonusHabilidade(atributos: Atributos) {
        atributos.sabedoria += 1
    }

    override fun mostrarAtributos(atributos: Atributos) {
        println("Atributos do Anão da Colina:")
        println("Força: ${atributos.forca}")
        println("Destreza: ${atributos.destreza}")
        println("Constituição: ${atributos.constituicao}")
        println("Inteligência: ${atributos.inteligencia}")
        println("Sabedoria: ${atributos.sabedoria}")
        println("Carisma: ${atributos.carisma}")
    }
}