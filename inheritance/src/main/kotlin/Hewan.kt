//Kelas Induk (SuperClass)

open class Hewan (protected var nama : String, protected val jenis : String) {
    open fun suara() {
        println("$nama adalah seekor $jenis dan mengeluarkan suara");
    }
}

class Kucing(nama : String) : Hewan(nama, "Kucing") {
    //override fungsi suara
    override fun suara() {
        println("Kucing bernama $nama : 'Meong... meong...!'");
    }
}

class Anjing(nama : String) : Hewan(nama, "Anjing") {
    override fun suara() {
        println("Anjing bernama $nama : 'Guk... guk!'");
    }
}

fun main() {
    val kucing1 = Kucing("Oyen");
    val anjing1 = Anjing("Rex")

    kucing1.suara()
    anjing1.suara()
}