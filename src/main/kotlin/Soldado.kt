import kotlin.random.Random

class Soldado {
    var nombre = ""
    var fuerza: Int=0
    var vida: Int=0

    constructor(){}

    constructor(nombre: String) {
        this.nombre = nombre
        fuerza = Random.nextInt(1,101)
        vida = Random.nextInt(1,101)
    }


}