public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        float num1 = 15;
        float num2 = 10;

        if (num1 > num2) {
            System.out.println("la suma es: " + (int) (num1 + num2));
            System.out.println("la diferencia es: " + (int) (num1 - num2));
        } else {
            System.out.println("el producto es: " + (int) (num1 * num2));
            System.out.println("la división es: " + (num1 / num2));;
        }
    }
}
