fun main(args: Array<String>) {
    // Ép kiểu dữ liệu

    //Ép kiểu rộng bé -> lớn -> không lo mất dữ liệu
    /*
    Int -> Long -> Float -> Double
    * */
    var soA:Int=20
//    var soB:Long = soA -> báo lỗi vì không ép được trực tiếp
    var soB:Long = soA.toLong()
    println(soA::class.java.typeName)
    println(soB::class.java.typeName)

    // Ép kiểu hẹp lớn -> bé -> có thể mất dữ liệu
    /*
    * Double -> Float -> Long -> Int
    * */
    var soC:Short = 32767
    var soD:Byte = soC.toByte() // sẽ trả ra -1 vì không thể lưu dữ liệu lớn
    println(soC)
    println(soD) // -1

    var soE:Short=120
    var soF:Byte=soC.toByte() // có thể lưu được vì dải giá trị của Byte -128 -> 127
    println(soE)
    println(soE::class.java.typeName)
    println(soF::class.java.typeName)
}