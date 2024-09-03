fun main(args: Array<String>) {
    var month: Int
    print("Enter month: ")
    var m: String? = readLine()
    if (m != null) {
        month = m.toInt()
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12) {
            println("$month has 31 days")
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            println("$month has 30 days")
        } else if (month == 2) {
            val year: Int
            println("Enter year: ")
            var y: String? = readLine()
            if (y != null) {
                year = y.toInt()
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    println("$month has 29 days")
                } else {
                    println("$month has 28 days")
                }
            } else {
                println("Invalid")
            }
        } else {
            println("Error !")
        }
    } else print("Invalid !")
}