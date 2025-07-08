package tp07.fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entre 1 et 10 compris : ");
        int nb = scanner.nextInt();
        while (nb < 1 || nb > 10) {
            nb = scanner.nextInt();
        }
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + nb * i);
        }
    }
}
