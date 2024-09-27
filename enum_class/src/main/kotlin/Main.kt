sealed class HasilLogin

class Sukses(val user : String) : HasilLogin()
class Gagal(val pesanError : String) : HasilLogin()
object  Loading : HasilLogin()

fun tampilkanHasilLogin(hasil : HasilLogin) {
    when(hasil) {
        is Sukses -> println("Login berhasil, selamat data ${hasil.user}")
        is Gagal -> println("Login gagal, alasan : ${hasil.pesanError}")
        Loading -> println("Sedan memproses login, harap tunggu...")
    }
}

fun main() {
    val hasil1 : HasilLogin = Sukses("Rizky")
    val hasil2 : HasilLogin = Gagal("Password Salah")
    val hasil3 : HasilLogin = Loading

    tampilkanHasilLogin(hasil1)
    tampilkanHasilLogin(hasil2)
    tampilkanHasilLogin(hasil3)
}