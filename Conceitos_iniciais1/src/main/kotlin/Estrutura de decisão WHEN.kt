fun main() {
    var cargo:String = "Presidente"
        when(cargo){
            "Presidente" -> println(6000f)
            "Gerente" -> println(4500f)
            "Coordenador" -> println(3000f)
            "Analista"  -> println(2400f)
            "Estagiário" -> println(1600f)
            else -> println("Cargo não identificado")
        }

    var imc:Float = 30f
    when(imc){
        10f -> println("IMC está 10 ou abaixo")
        20f -> println("IMC está 20 ou acima de 11")
        30f -> println("IMC está 30 ou maior que 21")
        50f  -> println("IMC está 50 ou maior que 31")
        else -> println("IMC acima do normal")
    }
}