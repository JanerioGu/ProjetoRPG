package org.example.Raças

import org.example.Atributos

class Gnomo : Bonus{
    override fun BonusHabilidade(atributos: Atributos) {
        atributos.inteligencia += 2
    }
    override fun mostrarAtributos(atributos: Atributos) {
        println("Atributos do Gnomo:")
        println("Força: ${atributos.forca}")
        println("Destreza: ${atributos.destreza}")
        println("Constituição: ${atributos.constituicao}")
        println("Inteligência: ${atributos.inteligencia}")
        println("Sabedoria: ${atributos.sabedoria}")
        println("Carisma: ${atributos.carisma}")
    }
}
