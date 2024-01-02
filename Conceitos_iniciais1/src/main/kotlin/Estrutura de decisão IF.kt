fun main() {
    // Classifique as pessoas através da faixa etária
    // Idoso - 60 anos Acima | Adulto - entre 21 e 59 anos | Jovem entre 18 e 20 anos | Criança 12 anos ou abaixo
    var idade:Int = 19
    if(idade >= 60){
        println("Essa pessoas é idosa")
    }else if(idade <= 59 && idade >=21){
        println("Essa pessoa é adulta")
    }else if(idade >= 18 && idade <= 20){
        println("Essa pessoa é jovem")
    }else{
        println("Essa pessoa é criança")
    }


}