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
        System.out.println("factorial1");
        int num = 0;
        int resultadoEsperado = 0;
        int resultado = Factorial.factorial(num);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testFactorial2(){
        System.out.println("factorial2");
        int num=5;
        int resultadoEsperado=120;
        int resultado=Factorial.factorial(num);
        assertEquals(resultadoEsperado,resultado);
    }
    
    @Test
    public void testFactorial3(){
        System.out.println("factorial3");
    }
}
