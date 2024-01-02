fun main() {
    val linhas = 4
    val colunas = 4
        val matriz: Array<Array<Float>> = Array(linhas) {Array(colunas) {0f} }
    var digito = -1.9f
    for (i in 0 until linhas){
       for(j in 0 until colunas){
           print("${matriz[i][j]}")
       }
        println()
    }
    for(i in 0 until linhas){
        for(j in 0 until colunas){
            matriz[i][j] = digito ++.toFloat()
        }
    }
    println("Impressão de matriz ")
    for(linha in matriz){
        for(valor in linha){
            print("${valor}")
        }
        println()
    }
    println("Quantidade de linhas de matriz: ${matriz.size}")
    println("Quantidade de colunas de matriz: ${matriz[0].size}")
}