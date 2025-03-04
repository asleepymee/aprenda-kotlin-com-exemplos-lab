// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val name: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val name: String, var conteudos: MutableList<ConteudoEducacional> = mutableListOf(), val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    
    fun addConteudo(conteudo: ConteudoEducacional){
        conteudos.add(conteudo)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val formacao = Formacao("Analista de Dados", nivel = Nivel.BASICO)
    
	formacao.addConteudo(ConteudoEducacional(nome = "ANÁLISE COMBINATÓRIA"))
    formacao.addConteudo(ConteudoEducacional(nome = "MATEMÁTICA E LÓGICA", 200))
    
    var usuario = Usuario("Bruno da Silva")
    formacao.matricular(usuario)
    usuario = Usuario("Alex Santos")
    formacao.matricular(usuario)
    
    println("Grade curricular da formação de '${formacao.name}'\n(Nível de dificuldade: ${formacao.nivel}):")
    println("================<>================")
    formacao.conteudos.forEach{
        conteudo -> println("Título: ${conteudo.nome} \nduração: ${conteudo.duracao}")
        println("==================================")
    }
    println("Alunos inscritos:")
    println("================<>================")
    formacao.inscritos.forEach{
        usuario -> println("Nome: ${usuario.name}")
        println("==================================")
    }
}