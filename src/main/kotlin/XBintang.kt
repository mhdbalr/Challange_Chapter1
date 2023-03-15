fun main() {
    println("POLA X")
    val xBintang = 9
    for (i in 0 until xBintang) {
        for (j in 0 until xBintang) {
            if (i == j || i + j == xBintang - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}