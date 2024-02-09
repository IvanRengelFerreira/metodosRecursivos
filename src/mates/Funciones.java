package mates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Funciones {

    // 1
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    // 2
    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    // 3
    public static int potencias(int n, int i) {

        if (n == 0) {
            return 1;
        } else {
            return i * potencias(n - 1, i);
        }
    }

    // 4
    public static Integer listaSuma(Integer tamaño, Scanner sc) {

        ArrayList<Integer> lista = new ArrayList<>();
        if (tamaño > 0) {
            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            lista.add(numero);
            return numero + listaSuma(tamaño - 1, sc);
        } else
            return 0;
    }

    // 5
    public static Integer mediaLista(Integer tamaño, Scanner sc) {
        ArrayList<Integer> lista = new ArrayList<>();

        if (tamaño > 0) {
            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            lista.add(numero);
            int suma = (numero + listaSuma(tamaño - 1, sc));
            return suma / tamaño;
        } else
            return 0;
    }

    // 7
    public static int sumaPares(int n) {

        int residuo = n % 2;
        if (residuo == 1) {
            n = n - 1;
        }
        if (n <= 1) {
            return 0;
        } else {
            return n + sumaPares(n - 2);
        }

    }

    // 8
    public static Integer listaSumaPares(Integer tamaño, Scanner sc) {

        ArrayList<Integer> lista = new ArrayList<>();

        if (tamaño > 0) {
            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            lista.add(numero);
            Integer residuo = numero % 2;
            if (residuo == 0) {
                return numero + listaSumaPares(tamaño - 1, sc);
            } else {
                return listaSumaPares(tamaño - 1, sc);
            }

        } else {
            return 0;
        }

    }

    // 9
    public static void solicitarNumeros(int tamaño, ArrayList<Integer> listaOriginal, Scanner sc) {
        if (tamaño > 0) {
            System.out.println("Introduce un número:");
            int numero = sc.nextInt();
            listaOriginal.add(numero);
            solicitarNumeros(tamaño - 1, listaOriginal, sc); // Llamada recursiva hasta completar el tamaño
        }
    }

    public static ArrayList<Integer> filtrarYOrdenarPares(ArrayList<Integer> listaOriginal) {
        ArrayList<Integer> listaPares = new ArrayList<>();
        for (Integer numero : listaOriginal) {
            if (numero % 2 == 0) {
                listaPares.add(numero); // Agregar solo si el número es par
            }
        }
        Collections.sort(listaPares); // Ordenar la lista de números pares
        return listaPares;
    }

    // 10
    public static ArrayList<Integer> listaPar(int n,ArrayList<Integer> lista) {
        int residuo = n % 2;

        if (residuo == 1) {
            n = n - 1;
        }

        if (n>=2) {
            lista.add(n);
            listaPar(n - 2,lista);
        }
            return lista;
    
    }
}
