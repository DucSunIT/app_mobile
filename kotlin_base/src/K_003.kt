fun main(args: Array<String>) {

    /*
    -- Khai báo biến
    var ten_bien:Kieu_du_lieu
    -- Khỏi tạo biến
    var ten_bien:Kieu_du_lieu = gia_tri
    * */
//    khai báo biến
    var soA: Int
    var soB: Float

//    khởi tạo biến
    var soC: Int = 10
    var soD: Short = 4
    var soE: Byte = 2

    // xuất dữ liệu biến ra màn hình
    println("giá trị số C là: " + soC)
    // dùng $ để xuất giá trị của một bạn
    println("giá trị số D là: $soD");

    // đặt tên biến
    var diemToan:Float;
    var hoVaTen:String;

    // kiếu số thực
    var y:Double=9.5; // khai báo tường minh
    var x = 8.7; // khai báo tắt

    // kiểm tra kiểu dữ liệu của biến
    println("Kiểu dữ liệu của y là: " + (y::class.java.typeName));
    println("Kiểu dữ liệu của x là: " + (x::class.java.typeName));

    // khai báo kiểu Float cần thêm f or F ở sau
    var a:Float =1.4f; // khai báo tường minh
    var b = 2.3F; // khai báo tắt
    println("Kiểu dữ liệu của a: " + (a::class.java.typeName))
    println("Kiểu dữ liệu của b: " + (b::class.java.typeName))

    // Kiểu số nguyên
    // khai báo kiểu long dùng L không dùng l
    var c:Long=50000L;
    var d = 90000L; // không có L sẽ thành kiểu int
    println("Kiểu dữ liệu của c: " + (c::class.java.typeName))
    println("Kiểu dữ liệu của d: " + (d::class.java.typeName))

    // Int
    var e:Int =20;
    var f = 19;
    println("Kiểu dữ liệu của e: " + (e::class.java.typeName))
    println("Kiểu dữ liệu của f: " + (f::class.java.typeName))

    // short / byte
    var g:Short = 32767 // value max
    var h:Byte = 127 // value max
    println("Kiểu dữ liệu của g: " + (g::class.java.typeName))
    println("Kiểu dữ liệu của h: " + (h::class.java.typeName))

    // Char -> Dùng để lưu kí tự trong ''
    var j:Char = 'a';
    var i ='b';
    println("Kiểu dữ liệu của j: " + (j::class.java.typeName))
    println("Kiểu dữ liệu của i: " + (i::class.java.typeName))

    // String -> dùng để lưu tập hợp các kí tự trong ""
    var hoTen:String = "DucSunIT";
    var ten = "Phạm Tiến Đức"
    println("Kiểu dữ liệu của hoTen: " + (hoTen::class.java.typeName))
    println("Kiểu dữ liệu của ten: " + (ten::class.java.typeName))

    // có thể khai báo môt đoạn thơ, văn bằng
    // 3 bộ nháy kép """"""
    var t = """
       Thân em như tấm lụa đào
       Phất phơ giữa chợ biết vào tay ai !!
    """
    println(t)

    // kiểu lí luận Boolean
    var check:Boolean = false;
    var check2:Boolean = true;
    println("Kiểu dữ liệu của check: " + (check::class.java.typeName))
    println("Kiểu dữ liệu của check2: " + (check2::class.java.typeName))

    // kiểu Array
    /*
    * var ten_mang:typeArray = typeArrayOf(giá trị 1,2,3,4....)
    * */
    var arr1:FloatArray =  floatArrayOf(2.3f, 4.5F, 6.5f)
    var arr2:CharArray = charArrayOf('a', 'r','f','h')
    var arr3:IntArray = intArrayOf(1,2,3,4,5)

    // hằng số -> giá trị không thể thay đổi
    val nhietDoSoi =100
    val doDong = 0
}