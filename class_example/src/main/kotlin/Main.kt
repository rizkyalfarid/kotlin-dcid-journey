class Animal () {
    var name : String = "Kucing";
    var weight : Double = 3.2;
    var age : Int = 2;
    var isMammal : Boolean = true

    fun makan () {
        println("$name makan...");
    }

    fun tidur () {
        println("$name tidur...");
    }
}

fun main () {
    var kucing = Animal();
    kucing.makan()

    kucing.name = "Jerapah";
    kucing.makan();
    kucing.tidur()
}