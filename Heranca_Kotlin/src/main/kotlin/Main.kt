//private, public e protected
private class F(){// estará disponível apenas no arquivo
    var teste = "Classe F"
}
open class Eletronico(marca:String){
    private fun ativarCorrente(){// Está disponível somente  classe que pertence

    }
    protected fun relogio(){// Está disponivel a classe que são herdadas
        println("Função relógio")
    }
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Está desligado")
    }
    var modelo:String = "Teste de herança"
    private var F:String = "Frase" // Está disponível somente  classe que pertence
}

class Computador(marca:String):Eletronico(marca){
    fun InstalarSoftware(){
        println("Instalando software ao computador")
        relogio()
    }
    fun Varredura(){
        println("Realizando varredura no computador")
    }
}

fun main() {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.InstalarSoftware()
    println(c.modelo)
    //c.F
    //c.ativarCorrente()
    var t:F = F()
    println(t.teste)

}