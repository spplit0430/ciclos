package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha:
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    val ls = System.lineSeparator() // Captura el salto de línea del sistema
    print("A:")
    val a = readLine()?.toIntOrNull() ?: return
    print("B:")
    val b = readLine()?.toIntOrNull() ?: return

    // Aseguramos que la salida de los números esté en la misma línea
    if (a < b) {
        for (i in a..b) {
            print(" $i")
        }
    } else {
        for (i in a downTo b) {
            print(" $i")
        }
    }
    // Aquí solo imprimimos el salto de línea una vez, al final
    println()
}



