class Pessoa(val an_nas:Int, var nome:String){
    var idade = 2023 - an_nas
    fun saudacao(){
        println("Seja bem vindo ${this.nome}")
    }
    fun acordar(x: Boolean = true){
        if(x == true){
            println("A ${this.nome} está acordada")
        }else{
            println("A ${this.nome} está dormindo")
        }
    }
}

fun main() {
    var pessoa: Pessoa = Pessoa(an_nas = 2003, nome = "Vitória")
    println(pessoa.an_nas)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")
    pessoa.saudacao()
    pessoa.acordar(false)
}