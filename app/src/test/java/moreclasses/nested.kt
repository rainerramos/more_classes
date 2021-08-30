package moreclasses

class Computer (val processorModel: String) {

   inner class Memory {
        fun getMemoryLevel(): Int {
            println(processorModel)
            return 70
        }
    }

}

fun main(args: Array<String>) {

    val m1: Computer.Memory = Computer("Intel").Memory()
    m1.getMemoryLevel()


    /*
    caso tenha INNER, primeiro eu faço a instância da classe externa (no caso "Computer",
    para então fazer  a instância da classe interna "Memory"

     */

}