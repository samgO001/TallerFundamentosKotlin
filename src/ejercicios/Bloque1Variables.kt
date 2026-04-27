
package ejercicios

fun bloque1Variables() {

    // 1. Perfil de Usuario
    val nombre = "Samuel"
    var ciudad = "Medellín"
    println("Nombre: $nombre, Ciudad: $ciudad")
    ciudad = "Bogotá"
    println("Nueva ciudad: $ciudad")

    // 2. Calculadora de Años
    val anioNacimiento = 2003
    val edadAproximada = 2025 - anioNacimiento
    println("Edad aproximada: $edadAproximada años")

    // 3. Tipos Explícitos
    val precioCoche: Double = 25000.99
    val pesoNaranja: Float = 0.18f
    val poblacionMundo: Long = 8100000000L
    println("Coche: $precioCoche, Naranja: $pesoNaranja kg, Población: $poblacionMundo")

    // 4. Inferencia
    val estaLloviendo = true
    println("¿Está lloviendo? $estaLloviendo")

    // 5. Constantes Reales
    println("Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
}

object Constants {
    const val VELOCIDAD_LUZ = 299_792_458
}