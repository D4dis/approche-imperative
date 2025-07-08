package tp07.fr.algorithmie;


import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalSticks = 21;
        boolean isPlayerTurn = random.nextBoolean();
        System.out.println("Le jeu commence avec 21 batons");
        System.out.println((isPlayerTurn ? "Le joueur" : "L'ordinateur") + " commence");
        while (totalSticks > 0) {
            int sticksTaken = 0;
            if (isPlayerTurn) {
                System.out.println("Il reste " + totalSticks + " baton. Combien voulez-vous en prendre ? (1-3)");
                sticksTaken = scanner.nextInt();
                while (sticksTaken < 1 || sticksTaken > 3 || sticksTaken > totalSticks) {
                    System.out.println("Choix invalide. Entrez un nombre entre 1 et 3, sans dépasser le nombre restant de batons");
                    sticksTaken = scanner.nextInt();
                }
                totalSticks -= sticksTaken;
                if (totalSticks == 0) {
                    System.out.println("Vous avez pris le dernier baton. Vous avez perdu");
                    break;
                }
                isPlayerTurn = false;
            } else {
                sticksTaken = Math.min(random.nextInt(3) + 1, totalSticks);
                System.out.println("L'ordinateur prend " + sticksTaken + " baton");
                totalSticks -= sticksTaken;
                if (totalSticks == 0) {
                    System.out.println("L'ordinateur a pris le dernier bâton. Vous avez gagné !");
                    break;
                }
                isPlayerTurn = true;
            }
        }
    }
}
