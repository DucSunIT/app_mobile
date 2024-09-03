fun main(args: Array<String>) {
    var dtb:Float=0.0f
    print("Nhập điểm trung bình: ")
    var s:String?= readLine()
    if(s!=null){
        dtb=s.toFloat()
        if(dtb>=8 && dtb<=10) println("Giỏi")
        else if(dtb<=8 && dtb>=6.5) println("Khá")
        else if(dtb<6.5 && dtb>=5) println("Trung Bình")
        else if(dtb<5 && dtb>=0) println("Yếu")
        else println("Error !!!")
    }
}