// [Template no Kotlin Playground](https://pl.kotl.in/aG3pqT54E)

enum class Nivel {Básico, Intermediário, Difícil}

data class ConteudoEducacional(var nome: String, var duracaomin: Int, var professor: String)

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel)

var inscritos = mutableListOf<String>()											//Criação da lista de usuarios
val listainscritos: List<String> = inscritos									//Lista read-only de usuarios

fun matricular(usuario: String) {												//Função para matricular novos usuarios
    inscritos.add(usuario)
}

fun printlist(): List<String> {													//Função para visualizar lista completa
    return listainscritos
}

fun main() {
    val aula1 = ConteudoEducacional("Introdução", 60, "Venilton")				//Criação de Conteúdo
    val aula2 = ConteudoEducacional("Hello World", 60, "Venilton")
    
    val kotlin = Formacao("Kotlin", listOf(aula1, aula2), Nivel.Intermediário)	//Criação de Formação
    
    matricular("Leonardo")														//Ação de matricular
    matricular("Fernando")
    matricular("Paula")
    
    println("Lista de usuários inscritos:")
    printlist().forEach {														//Visualização da lista de inscritos
        usuario -> println(usuario)
    }
 	
    println()																	//Pula linha
    println ("A formação em ${kotlin.nome}, de nível ${kotlin.nivel}, " +		//Imprime o cabeçalho da Formação
             "é composta pelo(s) seguinte(s) conteúdo(s):")
    for (conteudo in kotlin.conteudos) {
    println(" - ${conteudo.nome}: Carga horária de ${conteudo.duracaomin} " + //Imprime o detalhamento dos conteudos
             "min e ministrada por prof.(a) ${conteudo.professor}")
    }
}
