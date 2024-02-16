package mates;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class FuncionesIterativas {

    public static int numero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un numero");
        return sc.nextInt();
    }

    public static int tamaño() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el tamaño de la lista");
        return sc.nextInt();
    }
 
// Ejercicio 1 

    public static int suma(int n){
        int acumulado = 0;
        for(int i = 1; i<=n; i++)
        {
            acumulado += i;
        }
        return acumulado;
    }
 
// Ejercicio 2 
 
    public static int factorial(int n){
        int acumulado = 1;
        for(int i = 1; i<=n; i++)
        {
            acumulado *= i;
        }
        return acumulado;
    }

// Ejercicio 3 

public static int potencias(int base, int exponente) {
    if (exponente == 0) {
        return 1;
    } else {
        int acumulado = 1;
        for (int i = 1; i <= exponente; i++) {
            acumulado *= base;
        }
        return acumulado;
    }
}
 
// Ejercicio 4 
 
    public static int listaSuma(int tamaño, ArrayList<Integer> lista,Scanner sc){

        int acumulado = 0;
        for(int i = 0; i<tamaño; i++)
        {
            Integer numero = numero();
            lista.add(numero);
            acumulado += numero;
        }
        return acumulado;
    }
    
       
//Ejercicio 5 
 
    public static double mediaLista(int tamaño, Scanner sc, ArrayList<Integer> lista){
        int suma = listaSuma(tamaño,lista,sc);   
        return (double) suma / lista.size(); 
    }
 
// Ejercicio 6 
 
    // public static double desviacionTipica(ArrayList<Integer> lista, Scanner sc, int tamaño, double acumulado) {
    //     double media = mediaLista(tamaño,sc,lista);
    //     double raizCuadrada = 0;
    //     for (int numero : lista) {
    //         raizCuadrada += Math.pow(numero - media, 2);
    //     }
    //     return Math.sqrt(raizCuadrada / lista.size());
    // }
 
 
// Ejercicio 7  
 
    public static int sumaPares(int n){
        int acumulado = 0;
        for(int i = 2; i<=n; i+=2)
        {
            acumulado += i;
        }
        return acumulado;
    }
 
// Ejercicio 8 
 
    public static int listaSumaPares(int tamaño,ArrayList<Integer> lista, Scanner sc){
        int suma = 0;
        for (int num ;tamaño>0; tamaño--){
            num = numero();
            lista.add(num);
            if (num % 2 == 0){
                suma += num;
            }
        }
        return suma;
    }

// Ejercicio 9

    public static void solicitarNumeros(int tamaño, ArrayList<Integer> listaOriginal, Scanner sc) {

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            listaOriginal.add(numero);
        }
    }

    public static ArrayList<Integer> filtrarYOrdenarPares(ArrayList<Integer> listaOriginal) {
        ArrayList<Integer> listaPares = new ArrayList<>();
        for (Integer numero : listaOriginal) {
            if (numero % 2 == 0) {
                listaPares.add(numero); 
            }
        }
        Collections.sort(listaPares);
        return listaPares;
    }
 
 
 
// Ejercicio 10 

    public static ArrayList<Integer> listaPar(int n){
        ArrayList<Integer> lista = new ArrayList<>();
        
        if (n % 2 != 0) {
            n = n - 1;
            
        }
        for (int i = n; i >= 2; i -=2 )
        {
            lista.add(i);
        }
        return lista;
 
 
    }
 
// Ejercicio 11  
 
public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
    int producto = 0;
    for (int i = 0; i < lista1.size(); i++) {
        producto += lista1.get(i) * lista2.get(i);
    }
    return producto;
}
 
 
// Ejercicio 12 

public static int fibonacci(int n){
    if (n<=1){
        return n;
    }else{
    return fibonacci(n-1)+ fibonacci(n-2);
    }
}
 


 
}
 