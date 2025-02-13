package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema1() {
    // Leemos el valor de N desde la entrada estándar
    println("Ingresa N:")
    val N = readLine()!!.toInt()  // Leemos N como entero
    var i = 1
    val resultado = mutableListOf<Int>()
    // Calculamos los cuadrados de los números enteros mientras el cuadrado sea menor o igual a N
    while (i * i <= N) {
        resultado.add(i * i)  // Añadimos el cuadrado a la lista
        i++  // Incrementamos i para el siguiente número
    }
    print(resultado.joinToString(" ") + " ")  // Imprimimos todos los cuadrados
}














