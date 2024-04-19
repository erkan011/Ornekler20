import kotlin.concurrent.thread

fun main() {
    println("Başlangıç")

    // Yeni bir thread oluşturarak uzun süren bir işlemi başlatma
    thread {
        println("Arka planda uzun süren bir işlem başlatıldı")
        Thread.sleep(3000) // 3 saniye bekletme simülasyonu
        println("Arka plandaki işlem tamamlandı")
    }

    println("Ana thread devam ediyor")

    // Ana thread'i bekletme
    Thread.sleep(1000) // 1 saniye bekletme simülasyonu

    println("Bitiş")
}
