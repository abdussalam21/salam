//fun main() {
//    val timeClose = 17
//    val timeNow = 7
//    val isClosed = if (timeNow >= timeClose) "Kelas sudah tutup" else "kelas sudah buka"

//    println(isClosed)
//}


//fun main() {
//    val moon = 9
//    val result = when (moon) {
//        1 -> "January"
//        2 -> "February"
//        3 -> "March"
//        4 -> "April"
//        5 -> "May"
//        6 -> "June"
//        7 -> "July"
//        8 -> "August"
//        9 -> "September"
//        10 -> "October"
//        11 -> "November"
//        12 -> "December"
//        else -> "Invalid moon"
//    }
//    println(result)
//}


//fun main() {
//    val day = 7
//    when (day) {
//        1, 2, 3, 4, 5, 6, 7 -> println("Weekday")
//        else -> println("Weekend")
//    }
//}


fun main(args: Array<String>) {
    val day = 5
    when (day) {
        1 -> {
            println("First day of the week")
            println("Monday")
        }
        2 -> {
            println("First day of the week")
            println("Tuesday")
        }
        3 -> {
            println("First day of the week")
            println("Wednesday")
        }
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
} //MASUK RANGE