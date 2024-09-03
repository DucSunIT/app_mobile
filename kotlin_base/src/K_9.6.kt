fun main(args: Array<String>) {
    var year: Int
    println("Enter year: ")
    var y: String? = readLine()
    if (y != null) {
        year = y.toInt()
        if ((year % 4 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            println("$year is a leap year")
        } else println("$year is not a leap year")
    }
}