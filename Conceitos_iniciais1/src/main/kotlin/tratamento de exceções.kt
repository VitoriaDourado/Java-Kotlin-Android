import java.lang.ArithmeticException
import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 1

    try{
        val res = (numerador/denominador)
        println("Resultado da divisão ${res}")
    }catch (e: ArithmeticException){
        println("ERRO: Não existe divisão por zero")
    }

    var numero = -4.6
    try {
        val res2 = sqrt(numero)
        if(numero < 0){
            throw IllegalAccessException()
        }
        println("Resulatdo da radiciação ${res2}")
    }catch (e: IllegalAccessException){
        println("Não existe raiz real de números negativos")
    }
}