package moreclasses

sealed class Result {
    class Success(val message: String) : Result()
    class Error(val message: String, val errorCode: Int) : Result()

    /*diferença da classe SEALED é: caso eu queira fazer a herança e limitar dentro do
    mesmo arquivo que essa classe está, eu uso SEALED

    É basicamente o conceite de ENUM: uma vez definido o ENUM e quais são os valores
    dentro dele, não tem mais como alterar
     */
}

class Repo {
    fun execute() : Result {
        return Result.Success("Deu certo!")
       // return Result.Error("Deu erro!", 404)
    }
}

fun main() {

    val r1 = Repo()
    val result: Result = r1.execute()
    when (result) {
        is Result.Success ->{
            println("Deu sucesso")
        }
        is Result.Error -> {
            println("Deu erro!")
        }
    }

}