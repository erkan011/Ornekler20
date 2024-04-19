import java.io.File

fun main() {
    val dosya = File("dosya.txt")
    if (dosya.exists()){
        println("Dosya Var")
    }else{
        println("Dosya Yok")
    }
}