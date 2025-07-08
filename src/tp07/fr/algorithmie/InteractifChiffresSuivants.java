package tp07.fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre : ");
        int nb = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + i);
        }
    }
}
