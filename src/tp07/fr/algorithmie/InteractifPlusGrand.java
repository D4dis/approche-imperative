package tp07.fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int[] numbers = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Veuillez entrer un nombre :");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Le nombre le plus grand du tableau est : " + numbers[numbers.length - 1]);
    }
}
