class OBJT{
    fun amanhecer(n:Int){
        if(n <= 4 && n >= 0){
            println("Está de madrugada")
        }else{
            println("Está de dia")
        }
    }
    fun acordar(n:Int){
        if(n == 0){
            println("Está dormindo")
        }else{
            println("Está acordada")
        }
    }
}

fun main() {
    var obj:OBJT = OBJT()
    obj.amanhecer(1)
    obj.acordar(0)
    println("------------------------------")
    with(obj){
        amanhecer(1)
        acordar(0)
    }
}