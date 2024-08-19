import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    // chu vi diện tích hình tròn
    var r: Double = 0.0
    println("Nhập vào bán kính: ")
    var banKinh: String? = readLine()
    if (banKinh != null) {
        r = banKinh.toDouble()
        println("Chu vi hình tròn: " + 2 * PI * r)
        println("Diện tích hình tròn: " + PI * r.pow(2))
    }
}