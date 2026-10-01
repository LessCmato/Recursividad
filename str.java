package Recursividad;

public class str {

    public static void main(String[] args) {
        String palabra = "recursividad";
        System.out.print("Recorrido al revés: ");
        recorrerAlReves(palabra, palabra.length() - 1);
        System.out.println();
        System.out.println("String invertido: " + invertir(palabra));
    }

    public static void recorrerAlReves(String texto, int indice) {
        if (indice < 0) {
            return;
        }
        System.out.print(texto.charAt(indice));
        recorrerAlReves(texto, indice - 1);
    }

    public static String invertir(String texto) {
        if (texto.isEmpty()) {
            return "";
        }
        return invertir(texto.substring(1)) + texto.charAt(0);
    }
}