package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema7KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "3\n1\n4\n5\n6\n20\n0\n-5\n"

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
    fun problema7_esCorrecto() {
        // Ejecutamos la función
        repeat(8) {
            problema7()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "N:"+ls+"s = 36"+ls
        val caso2 = "N:"+ls+"s = 1"+ls
        val caso3 = "N:"+ls+"s = 100"+ls
        val caso4 = "N:"+ls+"s = 225"+ls
        val caso5 = "N:"+ls+"s = 441"+ls
        val caso6 = "N:"+ls+"s = 44100"+ls
        val caso7 = "N:"+ls+"Error"+ls
        val caso8 = "N:"+ls+"Error"+ls
        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5 + caso6 + caso7 + caso8

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}