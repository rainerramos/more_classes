package functions

fun Int.isHalfOf(value: Int) = value / 2 == this

fun main(args: Array<String>){

    10.isHalfOf(40)
    10 isHalfOf 30 // aqui temos um erro, pois não usei a palavra "infix" antes da função

}