package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema10KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "3\n4\n7\n0\n-3\n10\n"

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
    fun problema10_esCorrecto() {
        // Ejecutamos la función
        repeat(6) {
            problema10()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "n:"+ls+"1"+ls+"12"+ls+"123"+ls
        val caso2 = "n:"+ls+"1"+ls+"12"+ls+"123"+ls+"1234"+ls
        val caso3 = "n:"+ls+"1"+ls+"12"+ls+"123"+ls+"1234"+ls+"12345"+ls+"123456"+ls+"1234567"+ls
        val caso4 = "n:"+ls+"Error"+ls
        val caso5 = "n:"+ls+"Error"+ls
        val caso6 = "n:"+ls+"Error"+ls
        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5 + caso6

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}