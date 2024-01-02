fun Impressao(){
    println("Função sem parâmetro e sem retorno")
}
fun Soma(a:Int, b:Int):Int{// Função om parâmetro e com retorno
    return a + b
}

fun main() {
     Impressao()
    var x = 10
    var y = 20
    println(Soma(x,y))
    soma_2(x,y)
}

fun soma_2(a:Int, b:Int){//Função com parâmetro e sem retorno
    println("A soma das variáveis são: ${a+b}")

}