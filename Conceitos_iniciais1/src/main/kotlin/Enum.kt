enum class Prioridade{
    Baixa, Media, Alta
}
enum class Animais{
    gato, cahorro, tucano, papagaio, leopardo
}
enum class Prioridade2(val v:Int){
    B(0), M(7), A(10)
}
enum class Prioridade3(val value:Int){
    A(10){
        override fun toString(): String {
            return "Prioridade Alta com o valor $value"
        }
    },
    M(5){
        override fun toString(): String {
            return "Prioridade Médio com o valor $value"
        }
    },
    B(0){
        override fun toString(): String {
            return "Prioridade Baixa com o valor $value"
        }
    }
}

fun x(p:Prioridade){

}

fun main() {
    x(Prioridade.Alta) // forma de acessar valor de uma classe do tipo enum.
    for(p in Prioridade.values()){
        print("${p} ")
    }
    println()

    for(p in Animais.values()){
        print("${p} ")
    }
    println()

    for(p in Prioridade2.values()){
        print("${p.v} ")
    }
    println()

    for(p in Prioridade3.entries){
        println("${p} ")
    }
    println()
}