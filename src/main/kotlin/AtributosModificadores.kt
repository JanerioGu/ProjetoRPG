package org.example

data class AtributosModificadores(
    var forca: Int = 0,
    var destreza: Int = 0,
    var constituicao: Int = 0,
    var inteligencia: Int = 0,
    var sabedoria: Int = 0,
    var carisma: Int = 0
) {

    fun calcularModificador(valor: Int): Int {
        return (valor - 10) / 2
    }

    fun atualizarModificadores(atributos: Atributos) {
        forca = calcularModificador(atributos.forca)
        destreza = calcularModificador(atributos.destreza)
        constituicao = calcularModificador(atributos.constituicao)
        inteligencia = calcularModificador(atributos.inteligencia)
        sabedoria = calcularModificador(atributos.sabedoria)
        carisma = calcularModificador(atributos.carisma)
    }
}