package mates;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {


    public static int suma(int n) {
        if (n == 0) {
            return 0;
        }else{
            return n + suma(n-1);
        }
    }

    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static int potencias(int n, int i) {

        if (n == 0) {
            return 1;
        } else {
            return i * potencias(n - 1, i);
        }
    }

    public static Integer listaSuma(Integer tamaño){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
    if(tamaño > 0){
        System.out.println("Elige el numero que quieres agregar");
        Integer numero = sc.nextInt();
        lista.add(numero);
        return numero + listaSuma(tamaño - 1);
    }else
        return 0;
    }

    public static Integer mediaLista(Integer tamaño){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> lista = new ArrayList<>();
    
    if(tamaño > 0){
        System.out.println("Elige el numero que quieres agregar");
        Integer numero = sc.nextInt();
        lista.add(numero);
        int suma = (numero + listaSuma(tamaño - 1));
        return suma/tamaño;
    }else
        return 0;
    }

    public static int sumaPares(int n){
        
        int residuo = n%2;
        if(residuo == 1){
            n = n-1;
        }
        if (n<=1) {
            return 0;
        }else{
            return n + sumaPares(n-2);
            }
        
        
        }

        public static Integer listaSumaPares(Integer tamaño){
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> lista = new ArrayList<>();
            
        if(tamaño > 0){
            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            lista.add(numero);
            Integer residuo = numero % 2;
            if (residuo == 0) {
                return numero + listaSumaPares(tamaño-1);
            }else{
                return listaSumaPares(tamaño-1);
            }
            
        }else{
            return 0;
        }

        

        }
        public static ArrayList<Integer> listaParesOrden(int tamaño,ArrayList<Integer> listaNueva,int indice){

            Scanner sc = new Scanner(System.in);
            listaNueva = new ArrayList<>();
            ArrayList<Integer> lista = new ArrayList<>();
            indice = 0;

            if (tamaño > 0) {

            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            lista.add(numero);
             

            if ( lista.get(indice) % 2 == 0) {
                listaNueva.add(numero);
                listaParesOrden(tamaño-1,listaNueva,indice+1);
            }else{
                listaParesOrden(tamaño-1, listaNueva,indice+1);
            }
            }
                
            return listaNueva;
           
        }

        public static Integer listaParesApartir(int numero){

        }
    }

