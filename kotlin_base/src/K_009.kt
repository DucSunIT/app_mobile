fun main(args: Array<String>) {
    var dtn:Float=0.0f
    println("Nhập điểm tốt nghiệp: ")
    var s:String?= readLine()
    if(s!=null) {
        dtn=s.toFloat()
        if(dtn>=7.0) print("Bạn đã tốt nghiệp")
        else print("Bạn đã tạch")
    }

}