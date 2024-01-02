open class eletronicos(var marca:String){
    private fun corrente(ativo:Boolean){

    }
    open fun ligar(){
        corrente(true)
    }
    open fun desligar(){
        corrente(false)
    }
}

class PC(marca:String):eletronicos(marca){
    fun salvar(){
    }

    override fun desligar() {
        salvar()
        super.desligar()
    }

    override fun ligar() {
        salvar()
        super.ligar()
    }
}

class SmartTV(marca: String): eletronicos(marca){
    override fun ligar() {
        super.ligar()
    }

    override fun desligar() {
        super.desligar()
    }
}
fun salvar(){}
fun salvar(a:Int){}
fun main() {
    var pc = PC("Bell")
    pc.ligar()
    pc.desligar()
    pc.salvar()
}