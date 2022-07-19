import com.zakaria.kotlinplayground.InheritanceKotlin.SquareCabin

//fun main() {
//
//    val id = arrayOf(1, 2, 3, 4, 5)
//    //ascarray(id)
//
//
//    val name: String = "Zakaria"
//    println("" + hello(name))
//
//    val num1: Int = 18
//    val num2: Int = 20
//
//    //plus and minus +, -, *, /, %
//    num1.plus(num2)
//    num1.minus(num2)
//    num1.times(num2)
//    num1.div(num2)
//    num1.rem(num2)
//
//    arithmeticOperation()
//
//}

fun arithmeticOperation() {

}

fun ascarray(id: Array<Int>) {
    println(id.size)
    println(id.set(2, 62))
    println("index 2 value is = ${id[2]}")

    for (i in 4 downTo 0) {
        for (j in 1..3) {
            println(id[j])
        }
        println("\n")
    }

    for (i in 5 downTo 1 step 2) print(id[i])
}

fun hello(name: String): String {
    return "$name hello"
}





