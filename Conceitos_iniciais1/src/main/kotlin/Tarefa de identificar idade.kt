fun main() {
    println("Digite a idade: ")
    var idade = Integer.valueOf(readln())

    if (idade <= 18){
        println("Menor de idade")
    }else{
        println("Maior de idade")
    }
}