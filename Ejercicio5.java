//Ejercicio Propuesto No 17.

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pi, longitud, area, radio;

        radio = entrada.nextDouble();
        pi = 3.14;
        longitud = 2 * pi * radio;
        area = pi * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia es: " + longitud + " cm");
        System.out.println("El área del círculo es: " + area + " cm");

    }
}
