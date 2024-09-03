fun main(args: Array<String>) {
    // tìm số lớn nhất
    var a: Int = 10
    var b: Int = 4
    var max: Int
//    if (a > b) max = a
//    else max = b
//    print("Max = " + max)

    max = if(a>b) a else b
    print("Max = $max")
}