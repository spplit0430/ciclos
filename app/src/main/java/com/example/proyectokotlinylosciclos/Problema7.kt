package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
        problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Leer el valor de N
    val N = readLine()?.toIntOrNull()

    // Imprimir el valor de N
    println("N:")

    // Validar si N es un número positivo
    if (N == null || N <= 0) {
        println("Error")
    } else {
        var suma = 0
        for (i in 1..N) {
            suma += i * i * i
        }
        println("s = $suma")
    }
}
