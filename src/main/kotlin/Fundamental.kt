fun main() {
    val timeClose = 17
    val timeNow = 7
    val isClosed = if (timeNow >= timeClose) "kelas sudah tutup" else "kelas sudah buka"

    println(isClosed)
}