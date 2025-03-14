/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.apuesta;
public class Apuesta {

private int dineroDisponible;
private int golesLocal;
private int golesVisitante;
private int apostado;

/*Contructor por defecto*/
public Apuesta() {
}

/*Contructor por parámetros*/
public Apuesta(int dineroDisponible, int golesLocal, int golesVisitante) {
this.dineroDisponible = dineroDisponible;
this.golesLocal = golesLocal;
this.golesVisitante = golesVisitante;
this.apostado = 0;
}
/*Método para obtener el valor del atributo dinero_disp*/

public int getDineroDisponible() {
return dineroDisponible;
}
/*Método para modificar el valor del atributo dinero_disp*/

public void setDineroDisponible(int dineroDisponible) {
this.dineroDisponible = dineroDisponible;
}

/*Método para apostar.
* Permite elegir la cantidad a apostar, no pudiendo ser inferior a 1 ni superior a tu saldo disponible
* Este método será probado con JUnit
*/
public void apostar(int dinero) throws Exception {
if (dinero <= 0) {
throw new Exception("Amigo! No se puede apostar menos de 1€");
}

if (dinero > dineroDisponible) {
throw new Exception("No se puede apostar más de lo que tienes");
}
{
dineroDisponible -= dinero;
apostado = dinero;
}
}
/*Método que comprueba si se ha acertado el resultado del partido
* En caso de que lo haya acertado devuelve true. Chequea que no se metan menos de 0 goles
*
*/

public boolean comprobarResultado(int local, int visitante) throws Exception {
boolean acertado = false;
if ((local < 0) || (visitante) < 0) {
throw new Exception("Un equipo no puede meter menos de 0 goles, por malo que sea");
}

if (golesLocal == local && golesVisitante == visitante) {
acertado = true;
}
return acertado;
}
/* Método para cobrar la apuesta.
* Comprueba que se acertó el resultado y, en ese caso, añade el valor apostado multiplicado por 10
* al saldo disponible
* Este método se va a probar con Junit
*/

void cobrarApuesta(int cantidadGolesLocal, int cantidadGolesVisitante) throws Exception {

if (comprobarResultado(cantidadGolesLocal, cantidadGolesVisitante) == false) {
throw new Exception("No se puede cobrar una apuesta no acertada");
}
dineroDisponible = dineroDisponible + (apostado * 10) ;
}
}