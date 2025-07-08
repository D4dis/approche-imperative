package tp07.fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        System.out.println(randomInt);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Devinez le nombre entre 1 et 100 :");
        int nb = scanner.nextInt();
        int counter = 1;
        while (nb != randomInt) {
            if (nb < randomInt) {
                System.out.println("En dessous du nombre");
                System.out.println("Devinez le nombre entre 1 et 100 :");
            } else {
                System.out.println("Au dessus du nombre");
                System.out.println("Devinez le nombre entre 1 et 100 :");
            }
            nb = scanner.nextInt();
            counter++;
        }
        System.out.println("Bravo, vous avez trouvé en " + counter + " coups");
    }

}


