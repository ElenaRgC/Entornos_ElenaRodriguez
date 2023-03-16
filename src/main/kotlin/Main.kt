

fun main() {

    var nombresCristianos = listOf("Anastasio", "Rigoberto", "Ezequiel", "Ataulfo", "Anacleto", "Ermenegildo", "Estanislao", "Urbano", "Malaquías", "Segismundo", "Jesus", "Santiago", "Mateo", "Lucas", "Jorge")
    var nombresIslamicos = listOf("Ali", "Mohammed", "Ahmed", "Omar", "Abdullah", "Haid", "Yasin", "Hamza", "Tariq", "Musa", "Mahmoud", "Yahid", "Hassan", "Saeed", "Ibrahim")

    var ejercitoCristiano = Ejercito("Cristiano", "Alfonso X")
    ejercitoCristiano.crearSoldados(nombresCristianos)

    var ejercitoIslamico = Ejercito("Islamico", "Yusuf")
    ejercitoIslamico.crearSoldados(nombresIslamicos)

    println("Comienza la batalla de Alarcos:")

    do {
        var soldadoCristiano = ejercitoCristiano.escogerSoldado()
        var soldadoIslamico = ejercitoIslamico.escogerSoldado()

        println("El soldado ${soldadoCristiano.nombre} se enfrenta a ${soldadoIslamico.nombre} ")

            soldadoCristiano.vida -= soldadoCristiano.fuerza - soldadoIslamico.fuerza
            soldadoIslamico.vida -= soldadoIslamico.fuerza - soldadoCristiano.fuerza


        if (soldadoCristiano.fuerza > soldadoIslamico.fuerza) {
            println("Ha ganado ${soldadoCristiano.nombre} y le queda ${soldadoCristiano.vida} puntos de vida")
            if (soldadoCristiano.vida <= 0){
                ejercitoCristiano.soldados.remove(soldadoCristiano)
                println("Pero ha muerto en la batalla porque no le queda más vida")
            }
        }else{
            ejercitoCristiano.soldados.remove(soldadoCristiano)
            println("Ha ganado ${soldadoIslamico.nombre} y le queda ${soldadoIslamico.vida} puntos de vida")
            if (soldadoIslamico.vida <= 0){
                ejercitoIslamico.soldados.remove(soldadoIslamico)
                println("Pero ha muerto en la batalla porque no le queda más vida")
            }
        }

        println("${ejercitoCristiano.jefe} dice que a su ejército le quedan ${ejercitoCristiano.soldados.size} soldados vivos")
        println("${ejercitoIslamico.jefe} dice que a su ejército le quedan ${ejercitoIslamico.soldados.size} soldados vivos")

    }while (ejercitoCristiano.soldados.isNotEmpty() && ejercitoIslamico.soldados.isNotEmpty())

    println("La batalla ha terminado")

    if (ejercitoCristiano.soldados.isEmpty()){
        println("El ejército Islámico ha ganado")
    }else{
        println("El ejército Cristiano ha ganado")
    }


}