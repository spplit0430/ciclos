package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
    // Leer el valor de n
    val n = readLine()?.toIntOrNull()

    // Verificar si n es válido (0 < n ≤ 9)
    if (n == null || n <= 0 || n > 9) {
        println("n:")
        println("Error")
        return
    }

    // Imprimir la escalera de n pasos
    println("n:")
    for (i in 1..n) {
        for (j in 1..i) {
            print(j)
        }
        println() // Imprime un salto de línea después de cada paso
    }
}

