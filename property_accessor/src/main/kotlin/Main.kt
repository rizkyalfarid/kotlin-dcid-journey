//class Animal () {
//    var name : String = "Miaw Oyen"
//        get() {
//            println("Fungsi Getter Terpanggil");
//            return field;
//        } set(value) {
//            println("Fungsi Setter Terpanggil");
//            field = value;
//        }
//}
//
//fun main() {
//    var kucing = Animal();
//    println("hewan ${kucing.name}");
//
//    kucing.name = "Gajah";
//    println("hewan ${kucing.name}");
//}

//CONTOH YANG MUDAH DI MENGERTI TENTANG ACCESOR PROPERTY

class Kucing {
    var nama : String = "Joseph Bremanta Samuel";
    var umur : Int = 0
        set(value) {
            if(value >= 0) {
                field = value
            } else {
                println("Umur Tidak Boleh Negatif...")
            }
        } get() {
            return field
        }
}

fun main () {
    val kucingSaya = Kucing();
    kucingSaya.umur = 2;
    println("Kucing saya bernama ${kucingSaya.nama}, dan berumur ${kucingSaya.umur} tahun")
}