import java.util.Scanner;
 
 public class Ejercicio {
     public static void main(String[] args) throws Exception {
         Scanner input = new Scanner (System.in);
         System.out.println("Ingresa un número");
         int num = input.nextInt();
         System.out.println("El número es: " + num);
         if (num <= 0) {
             System.out.print("Número no valido");
             input.close();
             return;  
         }
         for (int K = 1 ; K<=num ; K++ ) {
             for (int j=1 ; j<=K ; j++ ) {
                 if (j%2==1) {
                     System.out.print(K);
                 } else {
                     System.out.print(K*-1);
                 }
                 if (j < K  ) {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         
     }
 }