import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el num de inicio");
        int inicio = input.nextInt();
        System.out.println("Ingrese el num Final del rango");
        int Fin = input.nextInt();
        if (inicio > Fin) {
            System.out.println("Entrada no válida");
            input.close();
            return;
        } 
        System.out.println(Math.max (2, inicio));
        for (int i = Math.max (2, inicio) ; i<Fin ; i++) {
            int contadorDivisores = 0; //2
            int primerDivisor = 0; //1
            int SegundoDivisor = 0; //1
            for (int j=2 ; j<=i ; j++) {
                if ( i % j == 0 ) {
                    contadorDivisores ++ ;
                    if (contadorDivisores == 1) {
                        primerDivisor ++;
                    } else if (contadorDivisores == 2) {
                        SegundoDivisor ++;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}