fun main(args: Array<String>) {
    var addtion:Float
    var subtraction:Float
    println("Enter the value of sum: ")
    var add:String?= readlnOrNull()
    println("Enter the value of sub: ")
    var sub:String?= readlnOrNull()
    if(add!=null && sub!=null){
        addtion=add.toFloat()
        subtraction=sub.toFloat()
        println("x = " + (addtion+subtraction)/2)
        println("y = " + (addtion-subtraction)/2)
    }
}