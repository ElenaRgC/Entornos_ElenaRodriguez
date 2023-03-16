import kotlin.random.Random

class Ejercito {
    var nombre: String = ""
    var jefe: String = ""
    var soldados = ArrayList<Soldado>()

    constructor() {}

    constructor(nombre: String, jefe: String) {
        this.nombre = nombre
        this.jefe = jefe
        }

    fun crearSoldados(nombres:List<String>){
        for (i in 1 .. 10){
            var nombreAleatorio = nombres[Random.nextInt(nombres.size)]
            soldados.add(Soldado(nombreAleatorio))
        }
    }

    fun escogerSoldado():Soldado{
        var soldadoAleatorio = Random.nextInt(soldados.size)
        return soldados[soldadoAleatorio]
    }

}