fun main(args: Array<String>) {
    // check even or odd number
    var a:Int
    println("Enter the value of a = ")
    var s:String?= readLine()
    if(s!=null){
        a=s.toInt()
        if(a%2==0) print("$a is an even number !")
        else print("$a is an odd number")
    }
}