fun main() {
    // Any, Unit, Nothing
    a(false)
    b()
    c()
}

fun a(valor: Any){
    println("Iprimindo o valor: ${valor}")
}

fun b():Unit{
    println("Função sem retorno")
}

fun c():Nothing{
    TODO ("oi")
    // a -> b
}

fun save(){

}
