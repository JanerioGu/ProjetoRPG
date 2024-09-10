package org.example

import org.example.Raças.*

class CriacaoPersonagem {
    val atributos = Atributos()
    val atributosModificadores = AtributosModificadores()

    fun iniciar() {
        val racaEscolhida = escolherRaca()

        if (racaEscolhida != null) {
            racaEscolhida.BonusHabilidade(atributos)

            distribuirPontos(atributos)

            atributosModificadores.atualizarModificadores(atributos)

            mostrarAtributos(atributos, atributosModificadores)

            executarAcoes()

        } else {
            println("Opção inválida, digite somente números de 1 a 18")
        }
    }

    private fun escolherRaca(): Bonus? {
        println("Qual raça você deseja ser?" +
                "\n01 - Anão" +
                "\n02 - Meio Orc " +
                "\n03 - Humano" +
                "\n04 - Alto Elfo" +
                "\n05 - Anão da colina" +
                "\n06 - Anão da montanha" +
                "\n07 - Draconato" +
                "\n08 - Drow" +
                "\n09 - Elfo da floresta" +
                "\n10 - Elfo" +
                "\n11 - Gnomo" +
                "\n12 - Gnomo da floresta" +
                "\n13 - Gnomo das rochas" +
                "\n14 - Halflings" +
                "\n15 - Halfling pés leves" +
                "\n16 - Halfling robusto" +
                "\n17 - Meio elfo" +
                "\n18 - Tiefling")
        val escolhaRaca = readLine()

        return when (escolhaRaca) {
            "1" -> Anões()
            "2" -> MeioOrc()
            "3" -> Humanos()
            "4" -> AltoElfo()
            "5" -> AnãoDaColina()
            "6" -> AnãoDaMontanha()
            "7" -> Draconato()
            "8" -> Drow()
            "9" -> ElfoDaFloresta()
            "10" -> Elfos()
            "11" -> Gnomo()
            "12" -> GnomoDaFloresta()
            "13" -> GnomoDasRochas()
            "14" -> Halflings()
            "15" -> HalflingPésLeves()
            "16" -> HalflingRobusto()
            "17" -> MeioElfo()
            "18" -> Tiefling()
            else -> null
        }
    }

    private fun distribuirPontos(atributos: Atributos) {
        val pontosDisponiveis = listOf(15, 14, 13, 12, 10, 8).toMutableList()
        val atributosNome = listOf("Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma")

        // Laço para distribuir os pontos para cada atributo
        for (atributo in atributosNome) {
            while (true) {
                println("Escolha um valor para $atributo dos disponíveis: $pontosDisponiveis")
                val escolha = readLine()?.toIntOrNull()

                // Verifica se o valor é válido e está disponível na lista
                if (escolha != null && pontosDisponiveis.contains(escolha)) {
                    pontosDisponiveis.remove(escolha)

                    // Atribui o valor escolhido diretamente ao atributo correspondente
                    when (atributo) {
                        "Força" -> atributos.forca = escolha
                        "Destreza" -> atributos.destreza = escolha
                        "Constituição" -> atributos.constituicao = escolha
                        "Inteligência" -> atributos.inteligencia = escolha
                        "Sabedoria" -> atributos.sabedoria = escolha
                        "Carisma" -> atributos.carisma = escolha
                    }
                    break
                } else {
                    println("Escolha inválida. Tente novamente.")
                }
            }
        }
    }

    fun mostrarAtributos(atributos: Atributos, atributosModificadores: AtributosModificadores) {
        val totalForca = atributos.forca + atributosModificadores.forca
        val totalDestreza = atributos.destreza + atributosModificadores.destreza
        val totalConstituicao = atributos.constituicao + atributosModificadores.constituicao
        val totalInteligencia = atributos.inteligencia + atributosModificadores.inteligencia
        val totalSabedoria = atributos.sabedoria + atributosModificadores.sabedoria
        val totalCarisma = atributos.carisma + atributosModificadores.carisma

        println("Atributos com modificadores aplicados:")
        println("Força = $totalForca")
        println("Destreza: $totalDestreza")
        println("Constituição: $totalConstituicao")
        println("Inteligência: $totalInteligencia")
        println("Sabedoria: $totalSabedoria")
        println("Carisma: $totalCarisma")
    }


    fun vida() {
        val vidaBase = 10

        // Calcula o valor total de Constituição (após aplicar bônus racial e pontos distribuídos)
        val constituicaoFinal = atributos.constituicao + atributosModificadores.constituicao

        // Recalcula o modificador de Constituição com base no valor total de Constituição
        val modificadorConstituicao = atributosModificadores.calcularModificador(constituicaoFinal)

        // Calcula a vida total usando a vida base e o modificador de Constituição
        val vidaTotal = vidaBase + modificadorConstituicao

        println("Vida Total: $vidaTotal")
    }





    private fun executarAcoes() {
        val acoes = AcoesPersonagem(this)
        while (true) {
            println("\nVocê deseja realizar alguma ação?" +
                    "\n1 - Atacar" +
                    "\n2 - Exibir Vida" +
                    "\n3 - Sair")
            val escolha = readLine()
            when (escolha) {
                "1" -> acoes.atacar()
                "2" -> vida()
                "3" -> {
                    println("Você encerrou suas ações.")
                    break
                }

                else -> println("Escolha inválida. Tente novamente.")
            }
        }
    }
}
