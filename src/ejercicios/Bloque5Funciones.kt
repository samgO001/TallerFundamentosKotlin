package ejercicios

// 21. Saludo Personalizado
fun saludar(nombre: String): String {
    return "¡Hola, $nombre! Bienvenido."
}

// 22. Suma Exprés (función de una línea)
fun sumar(a: Int, b: Int) = a + b

// 23. Parámetro por Defecto
fun crearRectangulo(ancho: Int, alto: Int = 10): String {
    return "Rectángulo de ${ancho}x${alto}"
}

// 24. Argumentos Nombrados — se llama a crearRectangulo con solo ancho por nombre
// 25. Conversor de Dólares a Pesos colombianos
fun convertirDolares(dolares: Double): Double {
    val tasaCambio = 4200.0
    return dolares * tasaCambio
}

fun bloque5Funciones() {

    // 21
    println(saludar("Diego"))

    // 22
    println("Suma: ${sumar(7, 3)}")

    // 23
    println(crearRectangulo(5))
    println(crearRectangulo(5, 20))

    // 24 - Argumento nombrado
    println(crearRectangulo(ancho = 8))

    // 25
    println("100 dólares = ${convertirDolares(100.0)} pesos")
}