package com.example.proyectokotlinylosciclos

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema2KtTest {

    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "10\n20\n10\n30\n10\n100\n10\n101\n100\n99\n1\n1000\n10\n10\n"
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
    fun problema2_esCorrecto() {
        // Ejecutamos la función
        repeat(7) {
            problema2()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "Ingresa x:"+ls+"Ingresa y:"+ls+"Necesitas 9 días para correr bien los 20 Km"+ls
        val caso2 = "Ingresa x:"+ls+"Ingresa y:"+ls+"Necesitas 13 días para correr bien los 30 Km"+ls
        val caso3 = "Ingresa x:"+ls+"Ingresa y:"+ls+"Necesitas 26 días para correr bien los 100 Km"+ls
        val caso4 = "Ingresa x:"+ls+"Ingresa y:"+ls+"Necesitas 26 días para correr bien los 101 Km"+ls
        val caso5 = "Ingresa x:"+ls+"Ingresa y:"+ls+"Necesitas 1 días para correr bien los 99 Km"+ls
        val caso6 = "Ingresa x:"+ls+"Ingresa y:"+ls+"Necesitas 74 días para correr bien los 1000 Km"+ls
        val caso7 = "Ingresa x:"+ls+"Ingresa y:"+ls+"Necesitas 1 días para correr bien los 10 Km"+ls
        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5 + caso6 + caso7

        Assert.assertEquals(expectedOutput, outContent.toString())
    }
}