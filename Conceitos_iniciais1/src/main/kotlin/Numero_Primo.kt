fun main() {
    for (i in 0..20) {
        if (ehPrimo(i)) {
            println("$i é um número primo.")
        }
    }
}

fun ehPrimo(num: Int): Boolean {
    if (num <= 1) {
        return false
    }

    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
