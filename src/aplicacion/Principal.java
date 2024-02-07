package aplicacion;

import java.util.Scanner;

import mates.Funciones;

public class Principal {

   
    public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Elige un numero");
    int numero = sc.nextInt();

    System.out.println("La suma de los primeros"+numero +"números es: " + Funciones.suma(numero));
    System.out.println("Elige un numero");
    numero = sc.nextInt();
    System.out.println("El factorial de "+numero+" es "+Funciones.factorial(numero));
    System.out.println("Elige un numero");
    numero = sc.nextInt();
    int potencia = sc.nextInt();
    System.out.println(numero+"a la"+potencia+"es"+Funciones.potencias(potencia, numero));
    }
}



