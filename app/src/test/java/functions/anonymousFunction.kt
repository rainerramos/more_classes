package functions

fun operacao(x: Int, y: Int, op: (Int, Int) -> Int ): Int {
    val ret = op(x,y)
    return ret
}

fun main(args: Array<String>){

    operacao(1, 2, fun (n1: Int, n2: Int): Int {
        val sum = n1 + n2
        println(sum)
        return sum
    })

    /*
    isso eu não consigo fazer no lambda: executar várias linhas, várias funções
     */

}