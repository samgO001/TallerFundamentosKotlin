package ejercicios

// 29. Extensión de Int
fun Int.esNegativo(): Boolean = this < 0

// 30. Extensión de String
fun String.quitarEspacios(): String = this.replace(" ", "")

fun bloque6Colecciones() {

    // 26. Lista de Compras
    val listaCompras = mutableListOf("Manzanas", "Leche", "Pan")
    listaCompras.add("Huevos")
    listaCompras.removeAt(1) // elimina "Leche" (el segundo elemento)
    println("Lista de compras: $listaCompras")

    // 27. Filtro de Precios
    val precios = listOf(10.0, 75.0, 30.0, 120.0, 45.0, 50.0)
    val preciosMenores50 = precios.filter { it < 50 }
    println("Precios menores a 50: $preciosMenores50")

    // 28. Buscador
    val amigos = listOf("Carlos", "Andrés", "Alejandra", "Beatriz", "Antonio")
    val primerConA = amigos.find { it.startsWith("A") }
    println("Primer amigo con 'A': $primerConA")

    // 29. Extensión de Int
    println("¿-5 es negativo? ${(-5).esNegativo()}")
    println("¿3 es negativo? ${3.esNegativo()}")

    // 30. Extensión de String
    val texto = "Hola Mundo Kotlin"
    println("Sin espacios: ${texto.quitarEspacios()}")
}