fun main() {
    for(i in 1..20){// Estrutura de repetiçao FOR crescente de 1 em 1
        print("${i} ")
    }
    print("\n")// Quebra de linha
    for(i in 20 downTo 1){
        print("${i} ")
    }
    print("\n")
    val sdr = "Criação de Aplicativos Android"
    for(i in sdr){
        print("${i} ")
    }
    print("\n")
    for(i in 1..20 step 2){// Estrutura de repetiçao FOR crescente de 1 em 1
        print("${i} ")
    }
}