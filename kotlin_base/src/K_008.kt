fun main(args: Array<String>) {
    var check:Boolean = "true".toBoolean()
    println(check)
    println(check::class.java.typeName)

    var a:Byte = "22".toByte()
    var b:Int = "235".toInt()
    println(a)
    println(b)
}