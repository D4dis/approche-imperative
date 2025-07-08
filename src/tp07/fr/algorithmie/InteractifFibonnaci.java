package tp07.fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un rang :");
        int rank = scanner.nextInt();
        int previous = 0;
        int current = 1;
        int fibonacci = 0;
        if (rank == 0) {
            fibonacci = 0;
        } else if (rank == 1) {
            fibonacci = 1;
        } else {
            for (int i = 2; i <= rank; i++) {
                fibonacci = previous + current;
                previous = current;
                current = fibonacci;
            }
        }
        System.out.println("Le nombre de rang " + rank + " dans la suite de Fibonacci est : " + fibonacci);
    }
}
