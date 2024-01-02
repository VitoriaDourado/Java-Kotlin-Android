class Robo{
    lateinit var nome:String
    fun ligar(){
        nome = "Inicializando Robo"
    }
    fun inicio_tardio(){
        if(!this::nome.isInitialized){
            nome = "Inicializando tardiamente"
            println(nome)
        }
    }
}

fun main() {
    var bot:Robo = Robo()
    println(bot.ligar())
    bot.inicio_tardio()
    println(bot.nome)
}