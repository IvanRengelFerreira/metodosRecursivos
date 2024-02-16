package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import mates.Funciones;
import mates.FuncionesIterativas;

public class PrincipalIterativo {
     public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    //Ejercicio 1
    int num = FuncionesIterativas.numero();
    System.out.println("La suma de los primeros "+num +" números es: " + FuncionesIterativas.suma(num));
    
    //Ejercicio 2
    num = FuncionesIterativas.numero();
    System.out.println("El factorial de "+num+" es "+FuncionesIterativas.factorial(num));

    //Ejercicio 3
    System.out.println("Elige el numero por el que lo potencias");
    int potencia = sc.nextInt();
    System.out.println(FuncionesIterativas.numero()+" a la "+potencia+" es "+FuncionesIterativas.potencias(potencia, FuncionesIterativas.numero()));

    //Ejercicio 4
    ArrayList<Integer> lista = new ArrayList<>();
    System.out.println("La suma de la lista es "+FuncionesIterativas.listaSuma(Funciones.tamaño(),lista,sc));

    //Ejercicio 5
    ArrayList<Integer> listaMedia = new ArrayList<>();
    System.out.println("La media de la lista es "+FuncionesIterativas.mediaLista(FuncionesIterativas.tamaño(),sc,listaMedia));

    //Ejercicio 6
    ArrayList<Integer> listaDesviacion = new ArrayList<>();
    System.out.println("La desviación típica de la lista es "+FuncionesIterativas.desviacionTipica(listaDesviacion, sc, listaDesviacion.size() - 1, 0.0));
    
    //Ejercicio 7
    System.out.println("La suma de los numeros pares desde "+FuncionesIterativas.numero()+" es "+FuncionesIterativas.sumaPares(FuncionesIterativas.numero()));

    //Ejercicio 8
    ArrayList<Integer> listaPares = new ArrayList<>();
    System.out.println("La suma de los numeros pares dentro de la lista son "+FuncionesIterativas.listaSumaPares(potencia, listaPares, sc));

    //Ejercicio 9
    ArrayList<Integer> lista1 = new ArrayList<>();
    FuncionesIterativas.solicitarNumeros(FuncionesIterativas.tamaño(),lista1,sc);
    ArrayList<Integer> lista2 = FuncionesIterativas.filtrarYOrdenarPares(lista1);
    System.out.println("La lista nueva de los numeros pares a partir de la lista dada es "+lista2);
    
    //Ejercicio 10
    System.out.println("La lista de los numeros pares desde "+FuncionesIterativas.numero()+" son "+FuncionesIterativas.listaPar(FuncionesIterativas.numero()));
    
    //Ejercicio 11
    ArrayList<Integer> listaProducto = new ArrayList<>();
    ArrayList<Integer> listaProducto2 = new ArrayList<>();
    FuncionesIterativas.solicitarNumeros(FuncionesIterativas.tamaño(), listaProducto, sc);
    FuncionesIterativas.solicitarNumeros(FuncionesIterativas.tamaño(), listaProducto2, sc);
    System.out.println("El producto escalar de las listas es: "+FuncionesIterativas.productoEscalar(listaProducto,listaProducto2));

    //Ejercicio 12
    System.out.println("El numero n-esimo de la serie de fibonacci es: "+FuncionesIterativas.fibonacci(FuncionesIterativas.numero()));

    

    }

   
}
 




