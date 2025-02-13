package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    var cuente = 0 // Contador de números pares

    while (true) {
        println("n:") // Imprimir el mensaje para que coincida con el test
        val num = readLine()?.toIntOrNull() ?: continue // Leer y validar entrada

        if (num == -1) break // Termina cuando se ingresa -1

        if (num % 2 == 0) cuente++ // Si es par, incrementar el contador
    }

    println("Pares = $cuente") // Imprimir cantidad de números pares en el formato esperado
}
