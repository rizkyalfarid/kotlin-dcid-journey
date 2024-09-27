//PRIVATE MODIFIER
//class Animal {
//    private val name: String,
//    private val weight: Double,
//    private val age: Int,
//    private val isMammal: Boolean
//}
//
//fun main() {
//    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//}


//PROTECTED MODIFIER
//open class Hewan {
//    protected var nama: String = "Tidak Diketahui"  // Bisa diakses di class turunan
//
//    protected fun perkenalan() {
//        println("Hewan ini adalah $nama")
//    }
//}
//
//class Kucing : Hewan() {
//    fun ubahNama(namaKucing: String) {
//        nama = namaKucing  // Akses 'nama' yang protected dari class Hewan
//    }
//
//    fun suara() {
//        perkenalan()  // Akses fungsi 'perkenalan' yang protected dari class Hewan
//        println("$nama mengeong")
//    }
//}
//
//fun main() {
//    val kucingSaya = Kucing()
//    kucingSaya.ubahNama("Luna")
//    kucingSaya.suara()  // Output: Hewan ini adalah Luna, Luna mengeong
//}

//INTERNAL MODIEFIER

internal class Anjing {
    internal  var nama : String = "Buddy"

    internal fun suara () {
        println("$nama menggonggong")
    }
}

fun main (){
    val anjingSaya = Anjing();
    anjingSaya.nama = "Nadilah"
    anjingSaya.suara()
}