fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for(i in 0..(numeros.size-1)){
        print("${numeros[i]} ")
    }
    print("\n")
    println("Acessando a sexta posicao ${numeros[6]}")
}

fun vetor_bool(){
    var a = booleanArrayOf(true, false, true, true, false)
    for(i in 0..(a.size-1)){
        print("${a[i]} ")
    }
    print("\n")
}

fun vetor_str(){
    var a = arrayOf("Fortaleza", "São Paulo", "Bonito")
    for(i in 0..(a.size-1)){
        print("${a[i]} ")
    }
    print("\n")
}


fun vetor_inteiros2(){
    var n = Array(10,{i->i})
    for(i in n){
        print("${n[i]} ")
    }
    print("\n")
}

fun main() {
    vetor_inteiros()
    vetor_inteiros2()
    vetor_bool()
    vetor_str()
}