class Silvestre(var nome:String){
    var ataque:Int = 0
    constructor(nome: String, ataque:Int) : this(nome){
        this.ataque = ataque
    }
    fun apr(){
        println("Meu animal silvestre é ${nome} e seu ataque é ${ataque}")
    }
}

fun main() {
    val s1 = Silvestre("Sapo")
    val s2 = Silvestre("Serpente", 1000)
    s1.apr()
    s2.apr()
}