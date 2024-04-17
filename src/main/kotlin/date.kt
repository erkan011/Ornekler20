import java.text.SimpleDateFormat
import java.util.Date
fun main() {
    val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
    val customDate = Date(1234567890000)

    val formattedDate = dateFormat.format(customDate)
    println("Özel Tarih: $formattedDate")

    val now = Date()
    val diffInMillis = now.time - customDate.time
    val diffInSeconds = diffInMillis / 1000
    val diffInMinutes = diffInSeconds / 60
    val diffInHours = diffInMinutes / 60
    val diffInDays = diffInHours / 24
    println("Şuan ile özel tarih arasındaki fark: ")
    println("$diffInMillis milisaniye")
    println("$diffInSeconds saniye")
    println("$diffInMinutes dakika")
    println("$diffInHours saat")
    println("$diffInDays gün")
}


//import java.util.Date

//fun main() {
//    // Şu anki zamanı al
//    val now = Date()
//
//    // Tarih ve saati yazdır
//    println("Şu anki zaman: $now")
//
//    // Tarihleri karşılaştır
//    val futureDate = Date(System.currentTimeMillis() + 86400000) // 1 gün sonrası
//    val pastDate = Date(System.currentTimeMillis() - 86400000) // 1 gün öncesi
//    println("Gelecek zaman: $futureDate")
//    println("Geçmiş zaman: $pastDate")
//
//    // Tarihleri karşılaştırarak işlem yapma
//    println("Gelecek zaman mı? ${futureDate.after(now)}")
//    println("Geçmiş zaman mı? ${pastDate.before(now)}")
//}