package com.example.proyectokotlinylosciclos

// Nombre:DAVID FRANCISCO GARCIA AMADOR
// Fecha: 13/02/2025
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    // Leer las entradas x y
    println("Ingresa x:")
    val x = readLine()?.toIntOrNull() ?: return
    println("Ingresa y:")
    val y = readLine()?.toIntOrNull() ?: return
    // Validamos que las distancias sean positivas
    if (x <= 0 || y <= 0) {
        println("Las distancias deben ser mayores a cero.")
        return
    }
    // Inicializamos las variables para el cálculo
    var Distancia = x.toDouble() // Distancia actual
    var dias = 1 // Empezamos en el primer día
    // Aumentamos la distancia cada día hasta alcanzar o superar la distancia objetivo
    while (Distancia < y) {
        Distancia *= 1.1 // Aumentamos un 10% cada día
        dias++ // Contamos el día
    }
    // Imprimimos el número de días necesarios en el formato esperado
    println("Necesitas $dias días para correr bien los $y Km")
}
