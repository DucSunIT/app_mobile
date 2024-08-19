fun main(args: Array<String>) {
    var a = 1
    println(a>0 && a<100)
    println(a>0 || a <100)
    println(!(a>0 || a <100))

    // phương thức
    println("---------------")
    println((a>0).and(a<100))
    println((a>0).or(a<100))
    println((a>0 || a<100).not())

    // ++ --
    println("------------------")
    var x = 10
    x++
    println("x = " +x)
    x--
    println("x = " + x)

    var b = 1
    var c  = 2
    var z = c++ - ++b +1
    println("z = " + z) // 1
    println("c = " + c) // 3


}