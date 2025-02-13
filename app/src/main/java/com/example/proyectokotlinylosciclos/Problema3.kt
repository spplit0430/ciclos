package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    var suma = 0

    while (true) {
        println("n:") // Imprimir "n:" en una línea antes de cada entrada
        val num = readLine()?.toIntOrNull() ?: continue // Leer número y validar entrada
        if (num == 0) break // Terminar si el número es 0
        suma += num // Sumar el número a la suma total
    }

    println("Suma = $suma") // Imprimir la suma total con el formato correcto
}

