import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value : Any = "Default"
    
    operator fun getValue(classRef: Any, property: KProperty<*>) : Any {
        println("Fungsi ini sama seperti getter untuk property ${property.name} pada class $classRef");
        return value;
    }
    
    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef");
        println("Nilai ${property.name} dari : $value akan berubah menjadi $newValue");

    }
}

class Animal {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class Person {
    var name : String by DelegateName();
}

class Hero {
    var name : String by DelegateName();
}

fun main () {
    val animal = Animal()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan : ${animal.name}")

    val person = Person();
    person.name = " Rizky Al Farid Hafizh"
    println("Nama Orang : ${person.name}");

    val hero = Hero();
    hero.name = "Superdede"
    println("Nama Superhero : ${hero.name}")
}