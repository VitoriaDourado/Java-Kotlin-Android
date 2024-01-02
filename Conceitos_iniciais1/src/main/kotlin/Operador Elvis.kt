fun main() {
    var str:String? = null
    str = "Vitória"
    if(str == null){
        println("Variável nula")
    }else{
        println(str)
    }
    //Operador Elvis
    println(str ?: "nula")// Operador Elvis lembra o operador ternário
}