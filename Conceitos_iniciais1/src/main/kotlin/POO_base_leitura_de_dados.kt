class Pessoa_(val an_nas:Int, var nome:String){
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
    println("Digite o ano que você nasceu: ")
    var x = readlnOrNull()?.toInt()?: 0
    println("Digite seu nome completo: ")
    var y = readln()
    println("Você está acordado?: ")
    var d = readln()
    var pessoa: Pessoa_ = Pessoa_(x, y)
    println(pessoa.an_nas)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")
    if(d == "sim"){
        pessoa.acordar(true)
    }else if(d == "não"){
        pessoa.acordar(false)
    }
}