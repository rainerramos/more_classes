package functions

infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main(args: Array<String>){

    10.isHalfOf(40)
    10 isHalfOf 30

    //OBS: infix só pode ser usada quando a função recebe 1 parâmetro apenas
    //a função infix ajuda na leitura do código, por ser um pouco mais simplificada

}