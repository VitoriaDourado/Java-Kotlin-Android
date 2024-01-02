import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite sua nota: ")
    var nota = scanner.nextFloat()

    if(nota >= 7.0 && nota <= 10){
        println("Aprovado")
    }
    else if( nota>= 4.0 && nota <= 7.0){
        println("Recuperação")
    }
    else if(nota <= 4.0 && nota >= 0){
        println("Reprovado")
    }
    else if (nota > 10.0 || nota < 0){
        println("ERRO: NOTA INEXISTENTE")
    }
}