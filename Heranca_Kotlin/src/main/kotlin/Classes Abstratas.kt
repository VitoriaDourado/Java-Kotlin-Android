interface Selvagem{
    fun atacar(){
        println("O animal está prestes a atacar")
    }
}
interface  quatro_patas{
    fun locomocao(){
        println("O animal se locomove em quatro patas")
    }
}

abstract class mamifero(var nome:String){// Classe abstrata somente para herdar as outras classes
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fale()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamifero")
    }
}

class dog(nome:String):mamifero(nome), Selvagem, quatro_patas{
    override fun acorda() {
        println("Cachorro está acordado")
    }

    override fun alimentacao() {
        println("Cachorro come ração")
    }

    override fun fale() {
        println("AU AU")
    }

    override fun habitat() {
        println("Casinha do cachorro")
    }

    override fun atacar() {
        println("Cachorro está atacando")
    }

}

fun main() {
    var d:dog = dog("Cachorro")
    d.tempo()
    d.acorda()
    d.fale()
    d.habitat()
    d.alimentacao()
    d.atacar()
    d.locomocao()
}