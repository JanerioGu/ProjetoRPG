package org.example.Raças

import org.example.Atributos

class GnomoDasRochas : Bonus{
    override fun BonusHabilidade(atributos: Atributos) {
        atributos.constituicao += 1
    }

    override fun mostrarAtributos(atributos: Atributos) {
        println("Atributos do Gnomo das Rochas:")
        println("Força: ${atributos.forca}")
        println("Destreza: ${atributos.destreza}")
        println("Constituição: ${atributos.constituicao}")
        println("Inteligência: ${atributos.inteligencia}")
        println("Sabedoria: ${atributos.sabedoria}")
        println("Carisma: ${atributos.carisma}")
    }
}