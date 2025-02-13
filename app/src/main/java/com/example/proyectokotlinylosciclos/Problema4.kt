package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    repeat(6) { problema4() } // Se ejecuta 6 veces, como en la prueba unitaria
}

// Función que resuelve el problema
fun problema4() {
    var maxNum = Int.MIN_VALUE // Mayor número encontrado
    var maxIndex = 0 // Índice del primer número más grande
    var index = 0 // Índice actual

    while (true) {
        println("n:") // Mensaje esperado por el test
        val numero = readLine()?.toIntOrNull() ?: continue // Leer número y validar

        if (numero == 0) break // Terminar al encontrar 0

        if (numero > maxNum) {
            maxNum = numero
            maxIndex = index
        }

        index++ // Incrementar índice
    }

    println("Posición del mayor = ${maxIndex + 1}") // Ajuste para índice basado en 1
}

