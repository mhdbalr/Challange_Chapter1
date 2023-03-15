fun main() {
    println("PIRAMIDA")
    piramida()
}
fun piramida() {
    val rows = 8
    var k = 0
    for (i in 1..rows) {

        for (space in 1..rows - i) {
            print("  ")
        }
        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }
        println()
        k = 0
    }
}