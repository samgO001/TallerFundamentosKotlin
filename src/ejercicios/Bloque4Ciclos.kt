package ejercicios

fun bloque4Ciclos() {

    // 16. Conteo Simple
    println("-- Conteo Simple --")
    for (i in 1..10) {
        println(i)
    }

    // 17. Cuenta Regresiva
    println("-- Cuenta Regresiva --")
    for (i in 10 downTo 1) {
        println(i)
    }

    // 18. Saltos de 3
    println("-- Saltos de 3 --")
    for (i in 1..20 step 3) {
        println(i)
    }

    // 19. While Infinito (Casi)
    println("-- While --")
    var energia = 5
    while (energia > 0) {
        println("Energía restante: $energia")
        energia--
    }

    // 20. Do-While
    println("-- Do-While --")
    var contrasenia = ""
    do {
        contrasenia = "1234" // simulación: siempre pone la respuesta correcta
        println("Contraseña ingresada: $contrasenia")
    } while (contrasenia != "1234")
    println("Acceso concedido")
}