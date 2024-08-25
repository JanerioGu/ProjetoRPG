package org.example.Raças

import org.example.Atributos

class AnãoDaMontanha : Bonus {
    override fun BonusHabilidade(atributos: Atributos) {
            atributos.forca += 2
    }

    override fun mostrarAtributos(atributos: Atributos) {
            println("Atributos do Anão da Montanha:")
            println("Força: ${atributos.forca}")
            println("Destreza: ${atributos.destreza}")
            println("Constituição: ${atributos.constituicao}")
            println("Inteligência: ${atributos.inteligencia}")
            println("Sabedoria: ${atributos.sabedoria}")
            println("Carisma: ${atributos.carisma}")
    }
}