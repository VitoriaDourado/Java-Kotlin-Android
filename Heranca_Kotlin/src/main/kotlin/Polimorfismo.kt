interface dev {
    var salario:Float
    fun bonus():Float
}
class mobile(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario * 0.7f
    }
}
class games(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario * 0.6f
    }
}
class backend(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

//SEM POLIMORFISMO
/*fun mostrar_bonus(m:mobile){
    println(m.bonus())
}
fun mostrar_bonus(g:games){
    println(g.bonus())
}
fun mostrar_bonus(b:backend){
    println(b.bonus())
}
*/

//COM POLIMORFISMO
fun mostrar_bonus(d:dev){
    println(d.bonus())
}

fun main() {
    mostrar_bonus(backend(1000f))
    mostrar_bonus(games(1000f))
    mostrar_bonus(mobile(1000f))
}