interface Kendaraan {
    val kecepatanMaks: Int
    fun bergerak(): String
}

abstract class Mesin(val nama: String, val tenaga: Int) {
    abstract fun jenisMesin(): String
}

class MesinBensin : Mesin("Mesin Bensin", 150) {
    override fun jenisMesin() = "Bensin"
}

class MesinListrik : Mesin("Mesin Listrik", 200) {
    override fun jenisMesin() = "Listrik"
}

abstract class Mobil(val mesin: Mesin) : Kendaraan {
    override fun bergerak() = "Mobil dengan mesin ${mesin.jenisMesin()} bergerak dengan kecepatan maksimal $kecepatanMaks km/jam"
}

class Sedan(mesin: Mesin) : Mobil(mesin) {
    override val kecepatanMaks = 220
}

class SUV(mesin: Mesin) : Mobil(mesin) { 
    override val kecepatanMaks = 180
}

data class Pemilik(val nama: String, val usia: Int)

class Garasi {
    private val daftarMobil = mutableListOf<Mobil>()

    fun tambahMobil(mobil: Mobil) = daftarMobil.add(mobil)

    fun daftarMobilTersedia(): List<Mobil> = daftarMobil
}

fun main() {
    val pemilik = Pemilik("Rizky Al Farid", 28)

    val sedanBensin = Sedan(MesinBensin())
    val suvListrik = SUV(MesinListrik())

    val garasi = Garasi()
    garasi.tambahMobil(sedanBensin)
    garasi.tambahMobil(suvListrik)

    println("Pemilik: ${pemilik.nama}, Usia: ${pemilik.usia}")
    garasi.daftarMobilTersedia().forEach { println(it.bergerak()) }
}
