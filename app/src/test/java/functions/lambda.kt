package functions

fun operador(x: Int, y: Int, op: (Int, Int) -> Int ): Int {
    val ret = op(x,y)
    return ret
}

fun soma(x: Int, y: Int) = x + y

fun multiplicar (x: Int, y: Int): Int = x * y

fun main(args: Array<String>) {

    operator(1, 2, ::sum)
    operator(1, 2, ::multiply)

    val l1 = {a: Int, b: Int -> a + b}
    val l2: (Int, Int) -> Int = { u, i -> u + i }
    operator(10, 20, l1)
    operator(10, 20, l2)

}
