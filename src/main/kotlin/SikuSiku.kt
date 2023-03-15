fun main() {
    println("SIKU SIKU")
    sikuSiku()
}
fun sikuSiku (){
    for (i in 1..8){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}