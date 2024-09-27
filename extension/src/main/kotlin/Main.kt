class Rectangle(val panjang : Int, val lebar : Int)

val Rectangle.keliling : Int
    get() = 2 * (panjang + lebar)

fun main() {
    val rectangle = Rectangle(5,3)

    println("keliling persegi panjang : ${rectangle.keliling}")
}