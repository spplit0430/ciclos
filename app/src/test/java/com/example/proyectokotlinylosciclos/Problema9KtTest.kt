package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema9KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "1\n2\n3\n4\n5\n8\n0\n-3\n"

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
    fun problema9_esCorrecto() {
        // Ejecutamos la función
        repeat(8) {
            problema9()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "n:"+ls+"s = 1"+ls
        val caso2 = "n:"+ls+"s = 3"+ls
        val caso3 = "n:"+ls+"s = 9"+ls
        val caso4 = "n:"+ls+"s = 33"+ls
        val caso5 = "n:"+ls+"s = 153"+ls
        val caso6 = "n:"+ls+"s = 46233"+ls
        val caso7 = "n:"+ls+"Error"+ls
        val caso8 = "n:"+ls+"Error"+ls
        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5 + caso6 + caso7 + caso8

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}