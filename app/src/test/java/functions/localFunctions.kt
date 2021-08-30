package functions

import com.google.android.material.datepicker.SingleDateSelector
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.log

fun log(str: String){
    println(str)
}

fun top() {
    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str - ${formatted.format(calendar.time)}")
    }

    log("Início")


    val interval = 1..10000000
    var sum: Double = 0.0
    for (i in interval){
        sum += 1 * 2 * 1
    }

    log("Fim")

}


fun main(args: Array<String>) {

    top()
    log("")
}