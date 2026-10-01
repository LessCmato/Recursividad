package Recursividad;
public class Suma {
    public static void main(String[] args) {
                System.out.println("Suma del 1 al 5: " + sumar(5)); 
    }
    public static int sumar(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumar(n - 1);
    }
}