package tp07.fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Veuillez entrer un nombre supérieur ou égal a 1 : ");
        int nb = scanner.nextInt();
        while (nb < 1) {
            nb = scanner.nextInt();
        }
        scanner.close();
        for (int i = 1; i <= nb; i++) {
            result += i;
        }
            System.out.println(result);
    }
}
