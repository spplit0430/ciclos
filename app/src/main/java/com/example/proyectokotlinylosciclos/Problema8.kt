package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    repeat(11) {
        problema8()
    }
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Leer el valor de n
    val n = readLine()?.toIntOrNull()

    // Imprimir el valor de n
    println("n:")

    // Validar que el número es positivo y entero
    if (n == null || n < 0) {
        println("Error")
        return
    }

    // Calcular el factorial
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }

    // Imprimir el resultado
    println("$n ! = $factorial")
}