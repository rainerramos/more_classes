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

    operator fun inc(): Fraction{
        return this
    }

}

fun main(args: Array<String>){

    var f1: Fraction = Fraction (3, 2)
    val f2: Fraction = Fraction (5, 3)

    println(f1 + f2)
    f1++

    /*
    aqui eu consigo usar o f1++ numa instância de uma classe
     */

}