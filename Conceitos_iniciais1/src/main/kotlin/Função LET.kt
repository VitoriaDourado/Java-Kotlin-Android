fun main() {
    var str:String? = null
    str = "Vitória"
    if(str != null){
        println("Caiu no if")
    }
    str?.let{
        println("Caiu na função LET")
    }
}