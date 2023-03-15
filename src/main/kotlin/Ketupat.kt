fun main() {
    println("KETUPAT")
    ketupat()
}
fun ketupat(){
    for (i in 1..4) {
        for (j in 4 downTo i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        for (l in 1..i - 1) {
            print("*")
        }
        println()
    }
    for (i in 1..5) {
        for (j in 1..i - 1) {
            print(" ")
        }
        for (z in 5 downTo i) {
            print("*")
        }
        for (k in 4 downTo i) {
            print("*")
        }
        println("")
    }
}