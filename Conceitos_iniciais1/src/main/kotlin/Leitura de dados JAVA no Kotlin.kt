import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System.`in`)
    println("Digite um número inteiro: ")
    val num = scanner.nextInt()
    println("Você digitou: ${num+1}")
}

fun ler_double(){
    val scanner = Scanner(System.`in`)
    println("Digite um número double: ")
    val num = scanner.nextDouble()
    println("Você digitou: ${num+1}")
}

fun ler_string(){
    val scanner = Scanner(System.`in`)
    println("Digite um número string: ")
    val num = scanner.next()
    println("Você digitou: ${num+1}")
}

fun ler_boolean(){
    val scanner = Scanner(System.`in`)
    println("Digite um número booleano: ")
    val num = scanner.nextBoolean()
    println("Você digitou: ${num}")
}

fun ler_float(){
    val scanner = Scanner(System.`in`)
    println("Digite um número float: ")
    val num = scanner.nextFloat()
    println("Você digitou: ${num+1}")
}

fun main() {
    ler_int()
    ler_double()
    ler_string()
    ler_float()
    ler_boolean()
}