fun main(args: Array<String>) {
    var a = 5
    var b =3
    println(a==b)
    println(a!=b)
    println(a>b)
    println(a<b)
    println(a>=b)
    println(a<=b)

    // phương thức
    println("-----------")
    println(a.equals(b))
    println(!a.equals(b))
    println(a.compareTo(b)>0)// true // a>b => >0; a==b => 0; a < b => <0
    println(a.compareTo(b)<0) // false
    println(a.compareTo(b)>=0) // true
    println(a.compareTo(b)<=0) // false

}