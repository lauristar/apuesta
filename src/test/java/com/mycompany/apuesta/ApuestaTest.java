/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.apuesta;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;


/**

 * @author laura
 */
public class ApuestaTest {

    public ApuestaTest() {
    }
     
     static Apuesta instance;
     
    
   @BeforeClass
    public static void beforeClass(){
     System.out.println("BeforeClass");
     instance = new Apuesta(1000, 2, 1);
 
    }
   @Before
    public void before(){
    
          System.out.println("INICIO NUEVO TEST");
    }
    
   

    //Prueba método Apostar () con valores válidos, dinero disponible 1000, apuesta 250
    @Test
    
   
    public void testApostarValorValido() throws Exception {

        System.out.println("apostar");
        int dinero = 250;
    //    Apuesta instance = new Apuesta(1000, 4, 2);
        instance.apostar(dinero);

    }

    //Prueba método Apostar () con valores no  válidos, dinero disponible 1000, apuesta 0, espera excepción
    @Test(expected = Exception.class)
    public void testApostarValorMenorQueUno() throws Exception {
        System.out.println("apostar");
        int dinero = 0;
    //    Apuesta instance = new Apuesta(1000, 4, 2);
        instance.apostar(dinero);
        //    fail("The test case is a prototype.");
    }

    //Prueba con valores no  válidos, dinero disponible 1000, apuesta 1100, la prueba falla si no se lanza una excepción
    @Test(expected = Exception.class)
    public void testApostarMayorQueDisponible() throws Exception {

        System.out.println("apostar");
        int dinero = 1100;
    //   Apuesta instance = new Apuesta(1000, 4, 2);
        instance.apostar(dinero);
       
    }

    //prueba metodo cobrarapuestas con valores válidos
    @Test
    public void testCobrarApuesta() throws Exception {
        System.out.println("cobrarApuesta");
        int cantidadGolesLocal = 2;
        int cantidadGolesVisitante = 1;
    //    Apuesta instance = new Apuesta(250, 2, 1);
        instance.cobrarApuesta(cantidadGolesLocal, cantidadGolesVisitante);
    }

    //prueba metodo cobrarapuestas con valores no válidos, cantidad goles visitante -1. El test falla si no lanza excepción
    @Test(expected =Exception.class)
    public void testCobrarApuestaGolesNegativos() throws Exception {
        System.out.println("cobrarApuesta");
        int cantidadGolesLocal = 2;
        int cantidadGolesVisitante = -1;
    //    Apuesta instance = new Apuesta(250, 2, 1);
        instance.cobrarApuesta(cantidadGolesLocal, cantidadGolesVisitante);
    }
    
     //prueba metodo cobrarapuestas con valores  válidos y con acierto. El test falla si dinero disponible no es = a dinerodisponible + (apostado*10)
    @Test
public void testCobrarApuestaConAcierto() throws Exception {
    System.out.println("cobrarApuesta");
    System.out.println(instance.getDineroDisponible());

  //  Apuesta instance = new Apuesta(250, 2, 1);
    instance.apostar(50); //al apostar 50 y acertar dinero disponible deberá ser 200 + 50*10 = 700

    int cantidadGolesLocal = 2;
    int cantidadGolesVisitante = 1;
    int expResult = instance.getDineroDisponible() + (50 * 10); // 200 + (50 * 10) = 700
   
    instance.cobrarApuesta(cantidadGolesLocal, cantidadGolesVisitante);
    int result = instance.getDineroDisponible();
    
    assertEquals(expResult, result);
}

}
