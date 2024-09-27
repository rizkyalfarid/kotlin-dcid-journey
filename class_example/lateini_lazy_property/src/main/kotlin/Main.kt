//class Kucing {
//    lateinit var nama : String;
//
//    fun setNamaKucing(namaKucing : String) {
//      nama = namaKucing
//    }
//
//    fun printNamaKucing() {
//        if(::nama.isInitialized) {
//            println("Nama Kucing saya adalah $nama");
//        } else {
//            println("Nama Kucing Belum Di inisialisasi");
//        }
//    }
//}


//fun main () {
//    val kucingSaya = Kucing();
//
//    println(kucingSaya.printNamaKucing())
//
//    kucingSaya.nama = "Joseph Bremanta Samuel";
//    println(kucingSaya.nama);
//}

class Buku (val judul : String) {
    val ringkasan : String by lazy {
        println("Mengisi ringkasan...");
        "Ringkasan Buku Judul";
    };
}

fun main () {
    val bukuSaya = Buku("Cinta Sua Lewat Layar Maya");
    println(bukuSaya.ringkasan)
}