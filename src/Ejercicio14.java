public class Ejercicio14 {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Tabla de multiplicar del " + numero + ":" );

        for (int i = 1; i <= 10; i++) { 
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}