package Recursividad;

public class potencia {
    public static void main(String[] args) {
          System.out.println("2 elevado a la 10: " + potencia(2, 10));
    }
        public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }
}