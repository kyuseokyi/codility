import lesson_one.BinaryGap
import kotlin.random.Random

fun main() {
    println("Hellow codility")
    var binaryGap: BinaryGap = BinaryGap()

    var randomNumber = Random.nextInt()
    var result = binaryGap.binaryGap(randomNumber)
    println("------result--------")
    println("input number " + randomNumber)
    println(result)
    println("------result--------")
}