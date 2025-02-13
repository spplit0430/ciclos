package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema4KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "1\n7\n9\n0\n1\n2\n3\n2\n1\n0\n3\n-2\n1\n0\n1\n2\n3\n4\n5\n0\n3\n5\n-1\n2\n5\n0\n5\n4\n3\n2\n1\n0\n"
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
    fun problema4_esCorrecto() {
        // Ejecutamos la función
        repeat(6) {
            problema4()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Posición del mayor = 3"+ls
        val caso2 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Posición del mayor = 3"+ls
        val caso3 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Posición del mayor = 1"+ls
        val caso4 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Posición del mayor = 5"+ls
        val caso5 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Posición del mayor = 2"+ls
        val caso6 = "n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"n:"+ls+"Posición del mayor = 1"+ls
        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5 + caso6

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}