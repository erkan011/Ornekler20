import java.io.File
fun main() {
    val dosya = File("Dosya.txt")
    dosya.createNewFile()
    dosya.writeText("Bu dosyanın içeriği")
    println("Dosya oluşturuldu ve içeriği yazıldı")
    val icerik = dosya.readText()
    println("Dosya İçeriği: \n$icerik")
    dosya.delete()
    println("Dosya silindi")
}
//fun main() {
//    val dosya = File("dosya.txt")
//    if (!dosya.exists()){
//        dosya.createNewFile()
//        println("Dosya Oluşturuldu.")
//    }else{
//        println("Dosya Zaten Var")
//    }
//}

//fun main() {
//    val dosya = File("dosya.txt")
//    if (dosya.exists()){
//        val icerik:String = dosya.readText()
//        println("Dosya İçeriği: $icerik")
//    }else{
//        println("Dosya Bulunamadı")
//    }
//}