package tp07.fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entre 1 et 10 compris : ");
        int nb = scanner.nextInt();
        while (nb < 1 || nb > 10) {
            nb = scanner.nextInt();
        }
        scanner.close();
        System.out.println(nb);
    }
}
