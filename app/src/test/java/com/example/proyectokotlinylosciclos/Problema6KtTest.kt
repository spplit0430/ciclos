package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema6KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "1\n10\n10\n1\n3\n3\n"
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
    fun problema6_esCorrecto() {
        // Ejecutamos la función
        repeat(3) {
            problema6()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "A:"+ls+"B:"+ls+"1 2 3 4 5 6 7 8 9 10 "
        val caso2 = "A:"+ls+"B:"+ls+"10 9 8 7 6 5 4 3 2 1 "
        val caso3 = "A:"+ls+"B:"+ls+"3 "
        val expectedOutput = caso1 + caso2 + caso3

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}