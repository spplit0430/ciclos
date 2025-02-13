package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Leer el valor de n
    val n = readLine()?.toIntOrNull()

    // Imprimir el valor de n
    println("n:")

    // Verificar si la entrada es válida
    if (n == null || n <= 0) {
        println("Error")
        return
    }

    // Variable para almacenar la suma de los factoriales
    var suma = 0

    // Calcular la suma de los factoriales
    for (i in 1..n) {
        var factorial = 1
        for (j in 1..i) {
            factorial *= j
        }
        suma += factorial
    }

    // Imprimir el resultado en el formato correcto
    println("s = $suma")
}
