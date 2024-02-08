package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import mates.Funciones;

public class Principal {

   
    public static void main(String[] args){

    Scanner sc  = new Scanner(System.in);

    // System.out.println("Elige un numero");
    // int numero = sc.nextInt();
    // System.out.println("La suma de los primeros "+numero +" números es: " + Funciones.suma(numero));

    // System.out.println("Elige un numero");
    // numero = sc.nextInt();
    // System.out.println("El factorial de "+numero+" es "+Funciones.factorial(numero));

    // System.out.println("Elige un numero");
    // numero = sc.nextInt();
    // System.out.println("Elige el numero por el que lo potencias");
    // int potencia = sc.nextInt();
    // System.out.println(numero+" a la "+potencia+" es "+Funciones.potencias(potencia, numero));

    // System.out.println("Elige la cantidad de numero que quieres tener en la lista");
    // Integer tamaño = sc.nextInt();
    // System.out.println("La suma de la lista es "+Funciones.listaSuma(tamaño));

    // System.out.println("Elige la cantidad de numero que quieres tener en la lista");
    // tamaño = sc.nextInt();
    // System.out.println("La media de la lista es "+Funciones.mediaLista(tamaño));

    // System.out.println("Elige un numero");
    // numero = sc.nextInt();
    // System.out.println("La suma de los numeros pares desde "+numero+" es "+Funciones.sumaPares(numero));

    // System.out.println("Elige el tamaño de la lista de numeros");
    // tamaño = sc.nextInt();
    // System.out.println("La suma de los numeros pares dentro de la lista son "+Funciones.listaSumaPares(tamaño));

    System.out.println("Elige el tamaño de la lista de numeros");
    Integer tamaño = sc.nextInt();
    sc.nextLine();
    ArrayList<Integer> lista = new ArrayList<>();
   ;
    System.out.println("La lista nueva de los numeros pares a partir de la lista dada es "+ Funciones.listaParesOrden(tamaño,lista,0));


    }
}
 


