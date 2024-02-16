package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import mates.Funciones;

public class Principal {

    
   
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    //Ejercicio 1
   int num1 = Funciones.numero();
    System.out.println("La suma de los primeros "+num1+" números es: " + Funciones.suma(num1));

    //Ejercicio 2
    num1 = Funciones.numero();
    System.out.println("El factorial de "+num1+" es "+Funciones.factorial(num1));

    //Ejercicio 3
    System.out.println("Elige el numero por el que lo potencias");
    int potencia = sc.nextInt();
    num1 = Funciones.numero();
    System.out.println(num1+" a la "+potencia+" es "+Funciones.potencias(potencia,num1));

    //Ejercicio 4
    System.out.println("La suma de la lista es "+Funciones.listaSuma(Funciones.tamaño(),sc));

    //Ejercicio 5
    System.out.println("La media de la lista es "+Funciones.mediaLista(Funciones.tamaño(),sc));

    //Ejercicio 6
    // ArrayList<Integer> listaDesviacion = new ArrayList<>();
    // System.out.println("La desviación típica de la lista es "+Funciones.desviacionTipica(listaDesviacion, sc, listaDesviacion.size() - 1, 0.0));

    //Ejercicio 7
    num1 = Funciones.numero();
    System.out.println("La suma de los numeros pares desde "+num1+" es "+Funciones.sumaPares(num1));

    //Ejercicio 8
    System.out.println("La suma de los numeros pares dentro de la lista son "+Funciones.listaSumaPares(Funciones.tamaño(),sc));

    //Ejercicio 9
    ArrayList<Integer> lista = new ArrayList<>();
    Funciones.solicitarNumeros(Funciones.tamaño(),lista,sc);
    ArrayList<Integer> listaParesOrdenada = Funciones.filtrarYOrdenarPares(lista);
    System.out.println("La lista nueva de los numeros pares a partir de la lista dada es "+listaParesOrdenada);
    

    //Ejercicio 10
    ArrayList<Integer> listaPares = new ArrayList<>();
    num1 = Funciones.numero();
    System.out.println("La lista de los numeros pares desde "+num1+" son "+Funciones.listaPar(num1,listaPares));
    
    //Ejercicio 11
    ArrayList<Integer> listaProducto = new ArrayList<>();
    ArrayList<Integer> listaProducto2 = new ArrayList<>();
    Funciones.solicitarNumeros(Funciones.tamaño(), listaProducto, sc);
    Funciones.solicitarNumeros(Funciones.tamaño(), listaProducto2, sc);
    System.out.println("El producto escalar de las listas es: "+Funciones.productoEscalar(listaProducto,listaProducto2,Funciones.tamaño()));

    //Ejercicio 12
    System.out.println("El numero n-esimo de la serie de fibonacci es: "+Funciones.fibonacci(Funciones.numero()));

    

    }

   
}
 


