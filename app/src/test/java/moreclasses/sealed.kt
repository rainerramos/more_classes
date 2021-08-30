package moreclasses

open class Result {
    class Success(val message: String) : Result()
    class Error(val message: String, val errorCode: Int) : Result()

    //uma classe pode herdar a outra desde que seja OPEN
}

fun main() {


}