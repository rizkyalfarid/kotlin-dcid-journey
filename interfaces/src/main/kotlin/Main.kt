interface Kendaraan {
    fun berjalan()

    fun berhenti() {
        println("Kendaraan berhenti")
    }
}

class Mobil : Kendaraan {
    override fun berjalan() {
        println("Mobil sedang berjalan.")
    }
}

class Motor : Kendaraan {
    override fun berjalan() {
        println("Motor sedang berjalan")
    }
}

fun main () {
    val mobil = Mobil()
    val motor = Motor()

    mobil.berjalan()
    mobil.berhenti()

    motor.berjalan()
    motor.berhenti()
}