package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema5KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "2\n1\n4\n0\n-1\n1\n3\n5\n7\n9\n1\n3\n5\n7\n9\n-1\n1\n2\n3\n4\n5\n6\n7\n-1\n-1\n7883\n-1\n"
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
    fun problema5_esCorrecto() {
        // Ejecutamos la función
        repeat(5) {
            problema5()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Pares = 3"+ls
        val caso2 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Pares = 0"+ls
        val caso3 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Pares = 3"+ls
        val caso4 = "n:"+ls+"Pares = 0"+ls
        val caso5 = "n:"+ls+"n:"+ls+"Pares = 0"+ls
        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}