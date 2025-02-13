package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema1KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "50\n9\n10\n36\n"
        System.setIn(ByteArrayInputStream(simulatedInput.toByteArray()))

        // Capturamos las salidas del sistema
        outContent = ByteArrayOutputStream()
        System.setOut(PrintStream(outContent))
    }

    @After
    fun restoreStreams() {
        // restaura System.in y System.out a sus estados originales después de cada prueba.
        System.setIn(originalIn)
        System.setOut(originalOut)
    }

    @Test
    fun problema1_esCorrecto() {
        // Ejecutamos la función
        repeat(4) {
            problema1()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "Ingresa N:"+ls+"1 4 9 16 25 36 49 "
        val caso2 = "Ingresa N:"+ls+"1 4 9 "
        val caso3 = "Ingresa N:"+ls+"1 4 9 "
        val caso4 = "Ingresa N:"+ls+"1 4 9 16 25 36 "
        val expectedOutput = caso1 + caso2 + caso3 + caso4

        assertEquals(expectedOutput, outContent.toString())
    }
}