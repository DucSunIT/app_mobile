fun main(args: Array<String>) {
    println("Nhập họ tên: ")
    var s: String? = readLine()
    println(s)
    var a: Int
    println("Nhập năm sinh: ")
    var age: String? = readLine()
    if (age != null) {
        a = age.toInt()
        println(a)
        print(a::class.java.typeName)
    }

}