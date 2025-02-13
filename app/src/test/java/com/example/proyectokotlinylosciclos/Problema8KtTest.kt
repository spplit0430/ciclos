package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema8KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n"

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
    fun problema8_esCorrecto() {
        // Ejecutamos la función
        repeat(11) {
            problema8()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "n:"+ls+"0 ! = 1"+ls
        val caso2 = "n:"+ls+"1 ! = 1"+ls
        val caso3 = "n:"+ls+"2 ! = 2"+ls
        val caso4 = "n:"+ls+"3 ! = 6"+ls
        val caso5 = "n:"+ls+"4 ! = 24"+ls
        val caso6 = "n:"+ls+"5 ! = 120"+ls
        val caso7 = "n:"+ls+"6 ! = 720"+ls
        val caso8 = "n:"+ls+"7 ! = 5040"+ls
        val caso9 = "n:"+ls+"8 ! = 40320"+ls
        val caso10 = "n:"+ls+"9 ! = 362880"+ls
        val caso11 = "n:"+ls+"10 ! = 3628800"+ls
        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5 + caso6 + caso7 + caso8 + caso9 + caso10 + caso11

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}