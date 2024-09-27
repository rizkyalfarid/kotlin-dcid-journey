////INHERITANCE
//
//open class Animal(val name : String, val weight : Double, val age : Int, val isCarnivore : Boolean) {
//    open fun eat() {
//        println("$name sedang makan");
//    }
//
//    open fun sleep() {
//        println("$name sedang tidur");
//    }
//}
//
//class Cat(pName : String, pWeight : Double, pAge : Int, pIsCarnivore : Boolean, val furCrolor : String, val numberOfFeet : Int)  : Animal(pName, pWeight, pAge, pIsCarnivore) {
//    fun playWithHuman() {
//        println("$name bermain bersama manusia");
//    }
//
//    override fun eat() {
//        super.eat();
//        println("$name sedang memakan ikan");
//    }
//
//    override fun sleep() {
//        println("$name sedang tidur di bantal");
//    }
//}
//
//fun main () {
//    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4);
//
//    dicodingCat.playWithHuman();
//    dicodingCat.eat();
//    dicodingCat.sleep();
//}
//

class Mahasiswa (private val nama : String, private val nim : String, private val jurusan : String) {
    fun tampilkanInfo() {
        println("Nama : $nama");
        println("NIM : $nim");
        println("Jurusan : $jurusan");
    }
}

fun main () {
    val mahasiswa1 = Mahasiswa("Rizky Al Farid", "10123028", "Teknik Informatika");
    mahasiswa1.tampilkanInfo();
    println()
    val mahasiswa2 = Mahasiswa("Arif Rahmansyah", "10123002", "Ilmu Komunikasi");
    mahasiswa2.tampilkanInfo();
}