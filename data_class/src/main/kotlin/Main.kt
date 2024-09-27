//class User(val name : String, val age : Int) {
//    override  fun toString() : String {
//        return "User(name=$name, age=$age)"
//    }
//}

//data class DataUser(val name : String, val age : Int)
//
//fun main() {
//    val dataUser = DataUser("nrohmen", 17)
//    val dataUser2 = DataUser("nrohmen", 17)
//    val dataUser3 = DataUser("dimas", 24)
//
//    println(dataUser.equals(dataUser2))
//    println(dataUser.equals(dataUser3))
//}

data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()

    println(dataUser4)
}