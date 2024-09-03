import kotlin.math.pow

fun main(args: Array<String>) {
    var height: Float
    var weight: Float
    println("Height(m): ")
    var h: String? = readlnOrNull()
    println("Weight(kg): ")
    var w: String? = readlnOrNull()
    if (h != null && w != null) {
        height = h.toFloat()
        weight = w.toFloat()
        val BMI = weight / (height.pow(2))
        println("BMI = $BMI")
        if (BMI < 15) println("Thân hình quá gầy")
        else if (BMI >= 15 && BMI<16) println("Thân hình gầy")
        else if (BMI >= 16 && BMI < 18.5) println("Thân hình hơi gầy")
        else if (BMI >= 18.5 && BMI < 25) println("Thân hình bình thường")
        else if (BMI >= 25 && BMI < 30) println("Thân hình hơi béo")
        else if (BMI >= 30 && BMI < 35) println("Thân hình béo")
        else println("Thân hình quá béo")
    }
}