package lesson_one

//about iteraions
//
class BinaryGap {
    init {

    }

    fun binaryGap(digit: Int): Int {
        val binary = Integer.toBinaryString(digit)

        println(binary)

        val binaryArray = binary.toCharArray()

        var oneCount = 0
        var zeroCount = 0
        var bigestZeroCount = 0
        val result: Int

        binaryArray.forEach {
            if (it == '0') {
                zeroCount++
            } else if (it == '1'){
                oneCount++
                if (bigestZeroCount < zeroCount) {
                    bigestZeroCount = zeroCount
                }
                zeroCount = 0
            }
        }

        result = if (oneCount < 2) {
            0
        } else {
            bigestZeroCount
        }

        return result
    }
}

