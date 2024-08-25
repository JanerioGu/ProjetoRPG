package org.example.Raças

import org.example.Atributos

class MeioOrc : Bonus{
    override fun BonusHabilidade(atributos: Atributos) {
        atributos.forca += 2
        atributos.constituicao += 1
    }
    override fun mostrarAtributos(atributos: Atributos) {
        println("Atributos do Meio Orc:")
        println("Força: ${atributos.forca}")
        println("Destreza: ${atributos.destreza}")
        println("Constituição: ${atributos.constituicao}")
        println("Inteligência: ${atributos.inteligencia}")
        println("Sabedoria: ${atributos.sabedoria}")
        println("Carisma: ${atributos.carisma}")
    }
}
