/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apuesta;
public class Main {

public static void main(String[] args) {
Apuesta miApuesta;
int miDinero;

miApuesta = new Apuesta(2000, 4, 2);
try {
System.out.println("Apostando...");
miApuesta.apostar(0);
} catch (Exception e) {
System.out.println("Fallo al realizar la Apuesta");
}

try {
System.out.println("Intento cobrar apuesta según el resultado del partido");
miApuesta.cobrarApuesta(4, 2);
} catch (Exception e) {
System.out.println("Fallo al cobrar la apuesta");
}
miDinero = miApuesta.getDineroDisponible();
System.out.println("El dinero que tengo tras las apuestas es " + miDinero);

System.out.println("Este es un mensajepara modificar el codigo y hacer un nuevo commit y push a github " );
}
}