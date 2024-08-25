package org.example.Raças

import org.example.Atributos

class Humanos : Bonus {
    override fun BonusHabilidade(atributos: Atributos) {
        atributos.forca += 1
        atributos.destreza += 1
        atributos.constituicao += 1
        atributos.inteligencia += 1
        atributos.sabedoria += 1
        atributos.carisma += 1
    }
    override fun mostrarAtributos(atributos: Atributos) {
        println("Atributos do Humano:")
        println("Força: ${atributos.forca}")
        println("Destreza: ${atributos.destreza}")
        println("Constituição: ${atributos.constituicao}")
        println("Inteligência: ${atributos.inteligencia}")
        println("Sabedoria: ${atributos.sabedoria}")
        println("Carisma: ${atributos.carisma}")
    }
}
