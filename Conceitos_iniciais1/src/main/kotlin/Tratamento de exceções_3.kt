import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo(){
    var arquivo = File("C:\\Users\\vitoria.dourado\\IdeaProjects\\Conceitos_iniciais1\\src\\main\\kotlin\\Passo a passo.txt")
    try{
        Scanner(arquivo).use{ l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo")
    }
}

fun main() {
    ler_arquivo()
}