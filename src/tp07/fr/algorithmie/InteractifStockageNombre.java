package tp07.fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int actualLength = 0;
        System.out.println("1 - pour ajouter un nombre \n2 - pour afficher les nombres \nQue souhaitez-vous faire ?");
        int userNb = scanner.nextInt();
        while (userNb != 2) {
            if (userNb == 1) {
                System.out.println("Entrez un nombre à ajouter au tableau :");
                int nbForArray = scanner.nextInt();
                if (actualLength == array.length) {
                    int[] array2 = new int[array.length * 2];
                    for (int i = 0; i < array.length; i++) {
                        array2[i] = array[i];
                    }
                    array = array2;
                }
                array[actualLength] = nbForArray;
                actualLength++;
            } else {
                System.out.println("Veuillez entrer 1 ou 2 uniquement.");
            }
            System.out.println("1 - pour ajouter un nombre \n2 - pour afficher les nombres \nQue souhaitez-vous faire ?");
            userNb = scanner.nextInt();
        }
        int[] resultArray = Arrays.copyOf(array, actualLength);
        System.out.println("Voici les nombres entrés : " + Arrays.toString(resultArray));
    }
}
