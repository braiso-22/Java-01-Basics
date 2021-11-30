# Java-01-Basics
Java course part 1
<ol>
<li> Realiza un programa que lea por consola un valor en euros y lo convierta a dólares
  (suponer que 1 euro es igual a 1,14 dólares).</li>
<li> Realiza un programa que lea por consola un valor en dólares y lo convierta a euros
  (suponer que 1 euro es igual a=1,14 dólares).</li>
<li> Realiza un programa que lea dos números enteros (sin decimales) y nos muestre los
resultados de sumar, restar y dividir dichos números. Comprueba que la división responde
  con decimales</li>
<li> Queremos conocer los datos estadísticos de una asignatura, por lo tanto,
necesitamos un programa que lea el número de suspensos, suficientes, notables y
sobresalientes de una asignatura, y nos calcule:
<ol>
  <li> El tanto por ciento de alumnos que han superado la asignatura.</li>
  <li> El tanto por ciento de notables y sobresalientes de la asignatura.</li>
  </ol>
Trata de minimizar el número de operaciones realizadas. Los datos se introducen en
variables sin decimales, pero los porcentajes sí tienen decimales. ¿Tendría algún sentido
  pedirle al usuario que introdujese el total de alumnos?</li>
  
<li> Un departamento de climatología ha realizado recientemente su conversión al
sistema métrico. Diseñar un algoritmo para realizar las siguientes conversiones:
<ol>
<li> Leer la temperatura dada en la escala Celsius y mostrar su equivalente
Fahrenheit (la fórmula de conversión es “F=9/5 oC+32”). Resultado
  redondeado a dos decimales.</li>
<li> Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su
equivalente en centímetros (25.5 mm = 1 pulgada). Resultado redondeado a
  un decimal.</li>
  </ol>
  </li>

<li> El coste de un automóvil nuevo para un comprador es la suma total del coste de
fábrica del vehículo, más el porcentaje de la ganancia de la tienda (que se aplica sobre el
coste de fábrica) y añadiéndole finalmente los impuestos estatales aplicables (sobre el
precio de venta calculado ya con beneficio de la tienda).
Suponiendo una ganancia de tienda de 10% y un impuesto del 20%, realiza un programa
  que lea el coste inicial del automóvil y calcule el coste para el consumidor.</li>
<li>Queremos realizar un pequeño programa para introducirlo en el ordenador de a
bordo de nuestro coche y que nos informe del consumo medio del coche cada 100 km.
Diseña un programa al que le introduzcamos el kilometraje de la última vez que se repostó,
el kilometraje actual, los litros de gasolina que tenía al finalizar la última vez que repostó y
  la cantidad de gasolina actual.</li>

<li> Diseñar un programa al que se le introduzcan las edades de cuatro personas y nos
calcule la media de edad de los mismos. Hacer una segunda versión que solo utilice dos
  variables. ¿Sería posible hacerlo con una sola variable?</li>
 <li> El siguiente programa pretende intercambiar dos variables enteras introducidas
previamente, y luego mostrarlas por pantalla. Corrige los errores que encuentres en el
código.
 </li>
  
```java
package ejercicios;
import java.util.Scanner;
public class Ejercicios {
public static void main(String[] args) {
int var1, var2;
System.out.print("Introduce var1: ");
var1 = teclado.nextInt();
System.out.print("Introduce var2: ");
var2 = teclado.nextInt();
var1 = var2;
var2 = var1;
System.out.println("Ahora var1 es igual a var1");
System.out.println("Ahora var2 es igual a var2");
}}
```
<li>Diseñar un programa al que se le introduzca la longitud de dos catetos de un ángulo
recto y nos devuelva el valor de la hipotenusa. Busca en internet como calcular en Java
potencias y raíces cuadradas para aplicar el teorema de Pitágoras. Investiga también si
    existe en Java alguna utilidad que nos haga este cálculo automáticamente.</li>
  </ol>
