package ejercicios

fun bloque3Condicionales() {

    // 11. Mayoría de Edad
    val edad = 20
    if (edad >= 18) {
        println("Puede votar")
    } else {
        println("No puede votar")
    }

    // 12. If como Expresión
    val nota = 75
    val resultado = if (nota >= 60) "Aprobado" else "Reprobado"
    println("Resultado: $resultado")

    // 13. Semáforo
    val color = "Rojo"
    when (color) {
        "Rojo"     -> println("Pare")
        "Amarillo" -> println("Precaución")
        "Verde"    -> println("Siga")
    }

    // 14. Rangos en When
    val temperatura = 10
    when {
        temperatura < 15        -> println("Frío")
        temperatura in 15..25   -> println("Templado")
        temperatura > 25        -> println("Calor")
    }

    // 15. Verificación de Tipo
    val variable: Any = "Hola Kotlin"
    when (variable) {
        is String -> println("Es un String")
        is Int    -> println("Es un Int")
        else      -> println("Tipo desconocido")
    }
}