package mates;

public class Funciones {

    public static int suma(int n) {
        int acumulado = 0;
        for (int i = 1; i <= n; i++) {
            acumulado += i;
        }
        return acumulado;
    }

    public static int factorial(int n){
        if (n<1) {
            return 1;
        }else{
            return n * factorial(n-1);
        }

    }

    public static int potencias(int n,int numero){
        if (numero == 0) {
            return 0;
        }else if(n == 0){
            return 1;
        }else{
            return n * potencias(n, numero);
        }
    }

   
}
