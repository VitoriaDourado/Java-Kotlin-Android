import java.lang.Exception
import java.lang.NullPointerException
import kotlin.math.sqrt

fun main() {
    try {
        var s:String? = null
        //s = "Vitoria"
        println("O tamanho da string é: ${s!!.length}")

        var a:Int = 10/0
        println("O resultado da divisão será: ${a}")

        var b = -9.0
        var c:Double = sqrt(b)
            if(b<0){
                throw IllegalAccessException()
            }
        var x = 1
        if(x==1){
            throw Exception("O valor de x não pode ser 1")
        }

    }catch (e: NullPointerException){
        println("A variável está vazia")
    }catch (e: ArithmeticException){
        println("Não existe na divisão por zero")
    }catch (e: IllegalAccessException){
        println("Não existe raiz de número negativo, sendo exclusivo para o conjunto de números complexos")
    }catch (e: Exception){
        println("Exceção mais geral")
        println(e.message)
    }finally {
        println("Executando finally e finalizando o tratamento de dados ")
    }
}