fun main(args: Array<String>) {
    var a = 10 // khai báo tắt, tự động nhận kiểu Int
    var b = 3

    // phép cộng
    println("a + b = " + (a + b))
    println("a + b = " + (a.plus(b)))

    // phép trừ
    println("a - b = " + (a - b))
    println("a - b =" + (a.minus(b)))

    // phép nhân
    println("a * b = " + (a*b))
    println("a * b = " + (a.times(b)))

    // phép chia
    println("a / b = " + (a.toFloat()/b))
    println("a / b = " + ((a.toFloat()).div(b)))

    // phép chia lấy dư
    println("a % b = " + (a%b))
    println("a % b = " + (a.rem(b)))

    // toán tử tiền tố một ngôi
    var x = 9.2f
    // - trừ một ngôi (đảo dấu)
    var y = x.unaryMinus()
    println("y = " + y) // thêm dấu trừ
    // + Cộng một ngôi
    var z = x.unaryPlus()
    println("z = " + z) // thêm dấu cộng

}