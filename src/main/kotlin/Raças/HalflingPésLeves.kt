package org.example.Raças

import org.example.Atributos

class HalflingPésLeves : Bonus{
    override fun BonusHabilidade(atributos: Atributos) {
        atributos.carisma += 1
    }
    override fun mostrarAtributos(atributos: Atributos) {
        println("Atributos do Halflings Pés Leves:")
        println("Força: ${atributos.forca}")
        println("Destreza: ${atributos.destreza}")
        println("Constituição: ${atributos.constituicao}")
        println("Inteligência: ${atributos.inteligencia}")
        println("Sabedoria: ${atributos.sabedoria}")
        println("Carisma: ${atributos.carisma}")
    }
}