import java.util.Scanner;

public class Main {
        public  static  void  main ( String [] args ) {
            Scanner escaner = new Scanner(System.in);

            System.out.println("Escribe un número:");

            double numero = escaner.nextDouble();

            if (numero == 0) {
                System.out.println("El número es neutro");
            } else if (numero < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es positivo");
            }
        }
    }