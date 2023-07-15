package cl.individual.ejercicio13

data class Heroe (
    val superHero: String,
    val publisher: String,
    val realName: String,
    val photo: String,
)

fun main() {
    var opcionSalir: Int =0
    var heroes = mutableListOf<Heroe>()


    println("Presione 1 para ingresar registros. Presione 0 para salir")
    opcionSalir = readln().toInt()
    while (opcionSalir != 0) {
        println("Nombre: ")
        var nombre = readln()
        println("Publisher: ")
        var publisher = readln()
        println("Nombre real: ")
        var realName = readln()
        println("Foto: ")
        var photo = readln()

        heroes.add(Heroe(nombre, publisher, realName, photo))
        println("Presione 1 para ingresar registros. Presione 0 para salir")
        opcionSalir = readln().toInt()
    }


    for (heroe in heroes) {
        println(heroe)
    }
}
