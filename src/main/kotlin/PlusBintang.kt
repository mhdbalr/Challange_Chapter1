fun main() {
    println("PLUS BINTANG")
    plusBintang()
}
fun plusBintang(){
    val n = 7
    for (i in 1 until(n + 1)){
        for (j in 1 until (n + 1)) {
            if (j % 7 == 0){
                print("* ")
            }else if (i % 4 == 0){
                print("* ")
            }else {
                print(" ")
            }
        }
        println("")
    }
}