
package ejercicios

fun bloque2NullSafety() {

    // 6. El Opcional
    var apodo: String? = null
    println("Apodo: $apodo")

    // 7. Operador Elvis
    val nombreMostrar = apodo ?: "Sin apodo"
    println(nombreMostrar)

    // 8. Llamada Segura
    val textoNulable: String? = null
    println("Longitud: ${textoNulable?.length}")

    // 9. Uso de Let
    val correo: String? = "usuario@correo.com"
    correo?.let {
        println("Correo enviado a $it")
    }

    // 10. Aserción No Nula
    val valor: String? = "Kotlin"
    val longitud = valor!!.length
    println("Longitud con !!: $longitud")
}