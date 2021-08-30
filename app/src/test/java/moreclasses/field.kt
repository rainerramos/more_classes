package moreclasses

class Car(val model: String, val maxSpeed: Int) {

    var currentSpeed: Int = 0
        set(value) {
            if(value > maxSpeed) {
                throw Exception("Velocidade maior do que a permitida!")
            } else {
                this.currentSpeed = value
            }

            field = value
        }
}

/* a palavra reservada "field" é utilizada
quando a gente quer usar GET e SET, pois evita que cai em um loop infinito*/

fun main(args: Array<String>) {

    val c1 = Car("", 220)
    c1.currentSpeed = 0

    println(c1.currentSpeed)

}