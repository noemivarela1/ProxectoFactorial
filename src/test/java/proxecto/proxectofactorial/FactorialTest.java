/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxecto.proxectofactorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Noemí
 */
public class FactorialTest {
    
    public FactorialTest() {
    }

    /**
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorial1() {
        System.out.println("factorial 0");
        int num = 0;
        int resultadoEsperado = 1;
        int resultado = Factorial.factorial(num);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testFactorial2(){
        System.out.println("factorial 120");
        int num=5;
        int resultadoEsperado=120;
        int resultado=Factorial.factorial(num);
        assertEquals(resultadoEsperado,resultado);
    }
    
    @Test
    public void testFactorial3(){
        System.out.println("factorial 1");
        int num=1;
        int resultadoEsperado=1;
        int resultado=Factorial.factorial(num);
        assertEquals(resultadoEsperado,resultado);
    }
    
    @Test
    public void testFactorial4(){
        System.out.println("factorial 4");
        long num=20;
        long resultadoEsperado=2432902008176640000L;
        long resultado=Factorial.factorial(num);
        assertEquals(resultadoEsperado,resultado);
    }
}
