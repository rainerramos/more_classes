package functions

data class Fraction (val numerator: Int, val denominator: Int) {
    operator fun plus (add: Fraction): Fraction {
        if (denominator == add. denominator) {
            return Fraction(numerator + add. numerator, denominator)
        } else {
            val commum = denominator + add. denominator
            return Fraction(((commum / denominator) * numerator) + ((commum / add.denominator) * add. numerator), commum)
        }
    }
}

fun main(args: Array<String>){

    val f1: Fraction = Fraction (3, 2)
    val f2: Fraction = Fraction (5, 3)

    println(f1 + f2)

    /*
    utilizando o "operator", eu consigo tratar uma soma entre 2 instâncias de uma classe
     */

}