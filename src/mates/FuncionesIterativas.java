package mates;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class FuncionesIterativas {
 
// Ejercicio 1 
 
    public static int suma(int n)
    {
        int acumulado = 0;
        for(int i = 1; i<=n; i++)
        {
            acumulado += i;
        }
        return acumulado;
    }
 
// Ejercicio 2 
 
    public static int factorial(int n)
    {
        int acumulado = 1;
        for(int i = 1; i<=n; i++)
        {
            acumulado *= i;
        }
        return acumulado;
    }
// Ejercicio 3 
public static int potencia(int base, int exponente) {
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
 
    public static int sumaLista(int tamaño,ArrayList<Integer> lista)
    {
        Scanner sc = new Scanner(System.in);
        int acumulado = 0;
        for(int i = 0; i<tamaño; i++)
        {
            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            lista.add(numero);
            acumulado += numero;
        }
        return acumulado;
    }
    
       
//Ejercicio 5 
 
    public static double mediaLista(ArrayList<Integer> lista)
    {
        int suma = sumaLista(lista.size(),lista);   
        return (double) suma / lista.size(); 
    }
 
// Ejercicio 6 
 
    public static double desviacionTipica(ArrayList<Integer> lista) {
        double a = mediaLista(lista);
        double raizCuadrada = 0;
        for (int numero : lista) {
            raizCuadrada += Math.pow(numero - a, 2);
        }
        return Math.sqrt(raizCuadrada / lista.size());
    }
 
 
// Ejercicio 7  
 
    public static int sumaPares(int n)
    {
        int acumulado = 0;
        for(int i = 2; i<=n; i+=2)
        {
            acumulado += i;
        }
        return acumulado;
    }
 
// Ejercicio 8 suma de los elementos pares de una lista de enteros.
 
    public static int sumaParLista(ArrayList<Integer> lista)
    {
        int suma = 0;
        for (int num : lista){
            if (num % 2 == 0 ){
                suma += num;
            }
        }
        return suma;
    }
 
// Ejercicio 9
 
    public static ArrayList<Integer> listaPares(ArrayList<Integer> lista)
    {
        ArrayList<Integer> par = new ArrayList<>();
        for (int num : lista){
            if (num % 2 == 0){
                par.add(num);
            }
        }
        return par;
 
    }
 
 
 
// Ejercicio 10 lista de los primeros números pares hasta n asumiendo n ≥ 2.
    public static ArrayList<Integer> listaDeSoloPar(int n)
    {
        ArrayList<Integer> soloPar = new ArrayList<>();
        int i = 0;
        for (i = n; i >= 2; i -=2 )
        {
            soloPar.add(i);
        }
        return soloPar;
 
 
    }
 
// Ejercicio 11  Producto escalar de dos listas de números no vacías y del mismo tamaño.
 
 
public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
    int producto = 0;
    for (int i = 0; i < lista1.size(); i++) {
        producto += lista1.get(i) * lista2.get(i);
    }
    return producto;
}
 
 
// Ejercicio 12 El elemento n-ésimo de la sucesión de Fibonacci
public static int fibonacci(int n){
    if (n<=1){
        return n;
    }else{
    return fibonacci(n-1)+ fibonacci(n-2);
    }
}
 
 
 
 
 
//Ejercicio 13 Calcule el cociente entre el decimo tercer y el decimo segundo elementode la sucesión de Fibonacci,
// y compare el resultado con 1+√52 .
 
public static  double cocienteFibo()
{
    int a = fibonacci(16);
    int b = fibonacci(12);
    return(double) a / b;
}
 
//Ejercicio 14 Averigüe la relación entre la sucesión de Fibonacci y la razón áurea.
 
public static double razonAurea() {
    return (1 + Math.sqrt(5)) / 2;
}
 
 
}
 