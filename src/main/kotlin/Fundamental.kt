fun main() {
    val timeClose = 20
    val timeNow = 60
    val isClosed = if (timeNow >= timeClose) "kelas sudah tutup" else "kelas sudah buka"

    println(isClosed)
}