package mates;
import java.util.ArrayList;
import java.util.List;
 
public class FuncionesIterativas {
 
// Ejercicio 1 suma
 
    public static int suma(int n)
    {
        int acumulado = 0;
        for(int i = 1; i<=n; i++)
        {
            acumulado += i;
        }
        return acumulado;
    }
 
// Ejercicio 2 Factorial
 
    public static int factorial(int n)
    {
        if (n == 0)
        return 1;
        else
        return n * factorial(n-1);
    }
// Ejercicio 3 exponente
public static int potencia(int base, int exponente) {
    if (exponente == 0) {
        return 1;
    } else {
        return base * potencia(base, exponente - 1);
    }
}
 
// Ejercicio 4 suma lista
 
    public static int sumaLista(ArrayList<Integer> lista)
    {
        if (lista.isEmpty()) {
            return 0;
        }
        else{
            return lista.get(0) + sumaLista(new ArrayList<>(lista.subList(1, lista.size())));
        }
    }
 
//Ejercicio 5 media aritmética de una lista
 
    public static double mediaAritm(ArrayList<Integer> lista)
    {
        int suma = sumaLista(lista);   //suma de todos los elementos de la lista
        return (double) suma / lista.size();  // divido la suma de los elementos entre el tamaño de la lista.
    }
 
// Ejercicio 6 desviación típica de una lista
 
    public static double desviacionTipica(ArrayList<Integer> lista) {
        double a = mediaAritm(lista);
        double raizCuadrada = 0;
        for (int num : lista) {
            raizCuadrada += Math.pow(num - a, 2);
        }
        return Math.sqrt(raizCuadrada / lista.size());
    }
 
 
// Ejercicio 7  La suma de los primeros números pares hasta n asumiendo n ≥ 2.
 
    public static int sumaPares(int n)
    {
        // Caso base. Si n es igual a 2 este es un número par, devuelve 2
        if (n == 2)
        {
            return 2;
 
        //si n es un número par mayor que 2,
        //se suma a la llamada recursiva sumaPares(n - 2).sumamos  n con la suma de los números pares menores a n
        } else if (n % 2 == 0)
        {
            return n += sumaPares(n- 2);
        } else {
            return sumaPares(n - 1);
        }
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
 
// Ejercicio 9 Dada una lista de números naturales mayores o iguales que 2
// obtiene otra lista con los números pares de la lista inicial, en el mismo
//orden y respetando los números repetidos
 
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
public static int Fibo(int nm){
    if (nm<=1)return nm;
    else
    return Fibo(nm-1)+ Fibo(nm-2);
}
 
 
 
 
 
//Ejercicio 13 Calcule el cociente entre el decimo tercer y el decimo segundo elementode la sucesión de Fibonacci,
// y compare el resultado con 1+√52 .
 
public static  double cocienteFibo()
{
    int a = Fibo(16);
    int b = Fibo(12);
    return(double) a / b;
}
 
//Ejercicio 14 Averigüe la relación entre la sucesión de Fibonacci y la razón áurea.
 
public static double razonAurea() {
    return (1 + Math.sqrt(5)) / 2;
}
 
 
}
 