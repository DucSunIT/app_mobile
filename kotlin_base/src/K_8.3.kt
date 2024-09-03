fun main(args: Array<String>) {
    var a: Int
    var b: Int
    println("Nhập chiều dài: ")
    var chieuDai: String? = readLine()
    println("Nhập chiều rộng: ")
    var chieuRong: String? = readLine()
    if (chieuRong != null && chieuDai != null) {
        a = chieuDai.toInt()
        b = chieuRong.toInt()
        println("Chu vi hình chữ nhật: " + (a + b) * 2)
        println("Diện tích hình chữ nhật: " + (a * b))
    }
}