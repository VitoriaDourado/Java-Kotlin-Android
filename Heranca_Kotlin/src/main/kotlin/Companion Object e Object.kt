class Matematica(){
    //Escopo Classe e Escopo Objeto
    companion object{// escopo classe
        val PI = 3.1415
        fun abc(){

        }
        init {
            println("Iniciando companion")
        }
    }
    object objt01{
        val PI = 3.1415
        fun abd(){}
        init {
            println("Iniciando objeto 01")
        }
    }
    object objt02{
        val PI = 3.1415
        fun abd(){}
        init {
            println("Iniciando objeto 02")
        }
    }
    object objt03{
        val PI = 3.1415
        fun abd(){}
        init {
            println("Iniciando objeto 03")
        }
    }
}

fun main() {
   // println(Matematica.PI)
    var m: Matematica = Matematica();
    //println("Acessando objeto 01 ${Matematica.objt01.PI}")
    //println("Acessando objeto 01 ${Matematica.objt02.PI}")
    //println("Acessando objeto 01 ${Matematica.objt03.PI}")
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.PI
}