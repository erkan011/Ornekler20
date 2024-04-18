fun main() {
    // Bir metin verisi oluştur
    val text: CharSequence = "Merhaba, dünya!"

    // Metni yazdır
    println("Metin: $text")

    // Metnin uzunluğunu al
    val length = text.length
    println("Metnin uzunluğu: $length")

    // Belirli bir karakteri al
    val firstChar = text[0]
    println("İlk karakter: $firstChar")

    // Metni alt alta yazdır
    println("Metin alt alta:")
    text.lines().forEach { println(it) }

    // Metni büyük harfe dönüştür
    val upperCaseText = text.toString().toUpperCase()
    println("Büyük harfli metin: $upperCaseText")

    // Belirli bir alt diziyi al
    val subSequence = text.subSequence(8, 13)
    println("Alt dizi: $subSequence")
}
